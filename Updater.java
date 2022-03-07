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
            System.out.println("Enter a placement number for " + artists.toName() + " on the Hot 100 or 0 when done.");
            int placement = scanner.nextInt();
            while (placement != 0) {
                points.add(101-placement);
                System.out.println("Enter a placement number for " + artists.toName() + " on the Hot 100 or 0 when done.");
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

    private static Map<String, Integer> playerPut(Map<String, Integer> values, Map<String, Integer> players, Players player, Artists artist1, Artists artist2, Artists artist3, Artists artist4, Artists artist5) {
        Integer pointer = players.get(player.toString()) + (values.get(artist1.toString()) / artist1.getMultiplier());
        players.put(player.toString(), pointer);
        pointer = players.get(player.toString()) + (values.get(artist2.toString()) / artist2.getMultiplier());
        players.put(player.toString(), pointer);
        pointer = players.get(player.toString()) + (values.get(artist3.toString()) / artist3.getMultiplier());
        players.put(player.toString(), pointer);
        pointer = players.get(player.toString()) + (values.get(artist4.toString()) / artist4.getMultiplier());
        players.put(player.toString(), pointer);
        pointer = players.get(player.toString()) + (values.get(artist5.toString()) / artist5.getMultiplier());
        players.put(player.toString(), pointer);
        return players;
    }

    public static void main(String[] args) {
        Map<String, Integer> values = new HashMap<>();
        for (Artists artists: Artists.values()) {
            values.put(artists.toString(), 0);
        }
        Map<String, Integer> players = new HashMap<>();
        for (Players player: Players.values()) {
            players.put(player.toString(), 0);
        }
        values = valueMaker(values);

        players = playerPut(values, players, Players.IVY, Artists.LILDURK, Artists.FUTURE, Artists.CARDIB, Artists.MORGANWALLEN, Artists.POSTMALONE);
        players = playerPut(values, players, Players.FANSTAR, Artists.POSTMALONE, Artists.WEEKND, Artists.MORGANWALLEN, Artists.ADELE, Artists.JUSTINBIEBER);
        players = playerPut(values, players, Players.LUIS, Artists.LILNASX, Artists.KENDRICKLAMAR, Artists.MARIAHCAREY, Artists.WEEKND, Artists.MEGAN);
        players = playerPut(values, players, Players.ACEOFHEARTS, Artists.BABYKEEM, Artists.MONEYBAGG, Artists.GIVEON, Artists.IMAGINEDRAGONS, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        players = playerPut(values, players, player, artist1, artist2, artist3, artist4, artist5);
        System.out.println(players);
        
        
    }
}
