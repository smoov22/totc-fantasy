import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Updater {
    public static void main(String[] args) {
        Map<String, Integer> values = new HashMap<>(); // name from enum, total points for week
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
        
            values.put(artists.toString(), total);
        }
        System.out.println(values);
        scanner.close();
    }
}
