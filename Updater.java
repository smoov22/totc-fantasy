import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Updater {
    public static Map<String,Integer> valueMaker (Map<String, Integer> values) {
        Scanner scanner = new Scanner(System.in);
        for (Artists artists: Artists.values()) {
            Set<Integer> points = new HashSet<>();
            int total = 0;
            System.out.println("Enter a placement number for " + artists.toString() + " on the Hot 100 or 0 when done.");
            int placement = scanner.nextInt();
            while (placement != 0) {
                points.add(101-placement);
                System.out.println("Enter a placement number for " + artists.toString() + " on the Hot 100 or 0 when done.");
                placement = scanner.nextInt();
            }
            for (int point: points) {
                total += point;
            }
        
            values.put(artists.toString(), total + values.get(artists.toString()));
        }
        System.out.println(values);
        scanner.close();
        return values;
    }

    public static void main(String[] args) {
        Map<String, Integer> values = new HashMap<>();
        for (Artists artists: Artists.values()) {
            values.put(artists.toString(), 0);
        }
        values = valueMaker(values);
    }
}
