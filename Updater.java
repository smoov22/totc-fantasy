import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Updater {
    public static Map<String, Integer> valueFromFile(Map<String, Integer> values, String filename) throws FileNotFoundException, IOException{
        FileReader fileReader = new FileReader(new File(filename));
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            String[] linepieces = line.split(", ");
            int points = 101 - Integer.parseInt(linepieces[0]);
            String artist = linepieces[2];
            for (Artists artists: Artists.values()) {
                if (artist.contains(artists.toName())) {
                    values.put(artists.toString(), points + values.get(artists.toString()));
                }
            }
            line = reader.readLine();
        }
        reader.close();
        fileReader.close();
        return values;
    }

    public static Map<String,Integer> manualvalueMaker (Map<String, Integer> values) {
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
        // values = valueMaker(values);
        try {
        values = valueFromFile(values, "bu.txt");
        } catch (IOException io) {
            System.out.println("IO exception");
        }
        players = playerPut(values, players, Players.IVY, Artists.LILDURK, Artists.FUTURE, Artists.CARDIB, Artists.MORGANWALLEN, Artists.POSTMALONE);
        players = playerPut(values, players, Players.FANSTAR, Artists.POSTMALONE, Artists.WEEKND, Artists.MORGANWALLEN, Artists.ADELE, Artists.JUSTINBIEBER);
        players = playerPut(values, players, Players.LUIS, Artists.LILNASX, Artists.KENDRICKLAMAR, Artists.MARIAHCAREY, Artists.WEEKND, Artists.MEGAN);
        players = playerPut(values, players, Players.ACEOFHEARTS, Artists.BABYKEEM, Artists.MONEYBAGG, Artists.GIVEON, Artists.IMAGINEDRAGONS, Artists.WILLOW);
        players = playerPut(values, players, Players.RAZOR, Artists.KEITHURBAN, Artists.BTS, Artists.CARRIEUNDERWOOD, Artists.DANANDSHAY, Artists.TRAVISBARKER);
        players = playerPut(values, players, Players.KIKA, Artists.BADBUNNY, Artists.HARRYSTYLES, Artists.LUKECOMBS, Artists.KODAKBLACK, Artists.CARLYPIERCE);
        players = playerPut(values, players, Players.KHAIWEE, Artists.OLIVIARODRIGO, Artists.DUALIPA, Artists.DOJACAT, Artists.BEYONCE, Artists.HARRYSTYLES);
        players = playerPut(values, players, Players.TREX, Artists.CARDIB, Artists.MAROON5, Artists.POSTMALONE, Artists.LILDURK, Artists.JBALVIN);
        players = playerPut(values, players, Players.RICKICKER, Artists.WEEKND, Artists.CHARLIXCX, Artists.TAYLORSWIFT, Artists.DOJACAT, Artists.AVAMAX);
        players = playerPut(values, players, Players.OCEANIC, Artists.TWENTYONESAVAGE, Artists.KANEBROWN, Artists.TAYLORSWIFT, Artists.ADELE, Artists.SZA);
        players = playerPut(values, players, Players.REKWIEM, Artists.KIDLAROI, Artists.LILUZIVERT, Artists.ARIANAGRANDE, Artists.WALKERHAYES, Artists.SZA);
        players = playerPut(values, players, Players.LIGHTNINGMATT, Artists.LUKECOMBS, Artists.RODWAVE, Artists.MARENMORRIS, Artists.LILDURK, Artists.YOUNGBOY);
        players = playerPut(values, players, Players.ZACH, Artists.BEYONCE, Artists.TAYLORSWIFT, Artists.DOJACAT, Artists.BTS, Artists.WEEKND);
        players = playerPut(values, players, Players.SKELLEZ,Artists.BADBUNNY, Artists.LILDURK, Artists.TWENTYONESAVAGE, Artists.DRAKE, Artists.ARILENNOX);
        players = playerPut(values, players, Players.ROADRUNNER, Artists.LILBABY, Artists.DOJACAT, Artists.LILNASX, Artists.MANESKIN, Artists.MORGANWALLEN);
        players = playerPut(values, players, Players.JEROME, Artists.MORGANWALLEN, Artists.POLOG, Artists.YOUNGBOY, Artists.LILBABY, Artists.FUTURE);
        players = playerPut(values, players, Players.ARG, Artists.RINASAWAYAMA, Artists.TWICE, Artists.BLACKPINK, Artists.CHRISSTAPLETON, Artists.MAROON5);
        players = playerPut(values, players, Players.REBORN, Artists.BADBUNNY, Artists.KANEBROWN, Artists.MONEYBAGG, Artists.GIVEON, Artists.SZA);
        players = playerPut(values, players, Players.MERRILYPUTRID, Artists.TAYLORSWIFT, Artists.LILDURK, Artists.FIVIOFOREIGN, Artists.SZA, Artists.MAEMULLER);
        players = playerPut(values, players, Players.JUSTALECKS, Artists.AVAMAX, Artists.TIESTO, Artists.LILNASX, Artists.MARSHMELLO, Artists.KANEBROWN);
        players = playerPut(values, players, Players.MONA, Artists.JID, Artists.SAWEETIE, Artists.JASONALDEAN, Artists.BTS, Artists.KIDCUDI);
        players = playerPut(values, players, Players.SCRUBS, Artists.EDSHEERAN, Artists.KODAKBLACK, Artists.KENDRICKLAMAR, Artists.LILDURK, Artists.GLASSANIMALS);
        players = playerPut(values, players, Players.GONZA, Artists.POLOG, Artists.GLASSANIMALS, Artists.KENDRICKLAMAR, Artists.SILKSONIC, Artists.ARILENNOX);
        players = playerPut(values, players, Players.REALHOTBOYSHIT, Artists.WEEKND, Artists.TAYLORSWIFT, Artists.ADELE, Artists.ARIANAGRANDE, Artists.ANDYWILLIAMS);
        players = playerPut(values, players, Players.SMOOV22, Artists.LUKECOMBS, Artists.KANEBROWN, Artists.STEPHANIE, Artists.LILDURK, Artists.WEEKND);
        players = playerPut(values, players, Players.BIGG0320, Artists.LILDURK, Artists.KIDLAROI, Artists.SZA, Artists.ERICCHURCH, Artists.WEEKND);
        players = playerPut(values, players, Players.CAMERONCARDINAL, Artists.LILBABY, Artists.LILDURK, Artists.OLIVIARODRIGO, Artists.MEGAN, Artists.SZA);
        players = playerPut(values, players, Players.KEATON, Artists.ADELE, Artists.TAYLORSWIFT, Artists.LILNASX, Artists.DOJACAT, Artists.THEANXIETY);
        System.out.println(players);
        
        
    }
}
