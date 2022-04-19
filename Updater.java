import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.python.util.PythonInterpreter;

public class Updater {
    public static Map<String, Integer> valueFromFile(Map<String, Integer> values, String filename) throws FileNotFoundException, IOException{
        FileReader fileReader = new FileReader(new File(filename));
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            if (line.contains("Dirty data!")) {
                System.out.println("Dirty data!");
                reader.close();
                fileReader.close();
                return null;
            }
            String[] linepieces = line.split("; ");
            int value = Integer.parseInt(linepieces[0]);
            int points = 101 - Integer.parseInt(linepieces[0]);
            if (value < 11) {
                points += 10;
            }
            else if (value < 21) {
                points += 5;
            }
            else if (value < 41) {
                points += 2;
            }
            String artist = linepieces[2];
            for (Artists artists: Artists.values()) {
                if (artist.toLowerCase().contains(artists.toName().toLowerCase())) {
                    values.put(artists.toString(), points + values.get(artists.toString()));
                    // System.out.println(artist + " " + linepieces[1] + " " + points + " for " + artists);
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
        int total = players.get(player.toString());
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
        player.setPoints(players.get(player.toString()));
        int newer = player.points - total;
        System.out.println(player.toString() + " gained " + newer + " points this week.");
        return players;
    }

    public static void main(String[] args) throws IOException{
        Map<String, Integer> values = new HashMap<>();
        for (Artists artists: Artists.values()) {
            values.put(artists.toString(), 0);
        }
        FileReader fileReader = new FileReader("export.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<String, Integer> players = new HashMap<>();
        String firstline = bufferedReader.readLine();
        if (firstline == null) {
            for (Players player: Players.values()) {
                players.put(player.toString(), 0);
            }
        }
        else if (firstline.isEmpty()) {
            for (Players player: Players.values()) {
                players.put(player.toString(), 0);
            }
        }
        else {String line = bufferedReader.readLine();
        while (line != null) {
            String[] parts = line.split(": ");
            players.put(parts[0], Integer.parseInt(parts[1]));
            line=bufferedReader.readLine();
        }
    }
        // for (Players player: Players.values()) {
        //     players.put(player.toString(), 0);
        // }
        // values = valueMaker(values);
        bufferedReader.close();
        fileReader.close();
        System.out.println(players);
        try {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("year_end.py");
        interpreter.close();
        values = valueFromFile(values, "temp.txt");
        } catch (IOException io) {
            System.out.println("IO exception");
        }
        // System.out.println(values);
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
        players = playerPut(values, players, Players.BACON, Artists.WEEKND, Artists.TAYLORSWIFT, Artists.ADELE, Artists.ARIANAGRANDE, Artists.ANDYWILLIAMS);
        players = playerPut(values, players, Players.SMOOV22, Artists.LUKECOMBS, Artists.KANEBROWN, Artists.STEPHANIE, Artists.LILDURK, Artists.WEEKND);
        players = playerPut(values, players, Players.BIGG0320, Artists.LILDURK, Artists.KIDLAROI, Artists.SZA, Artists.ERICCHURCH, Artists.WEEKND);
        players = playerPut(values, players, Players.CAMERONCARDINAL, Artists.LILBABY, Artists.LILDURK, Artists.OLIVIARODRIGO, Artists.MEGAN, Artists.SZA);
        players = playerPut(values, players, Players.KEATON, Artists.ADELE, Artists.TAYLORSWIFT, Artists.LILNASX, Artists.DOJACAT, Artists.THEANXIETY);
        String stringer = "Total points:\n";
        List<Players> pointers = new LinkedList<>();
        for (Players player: Players.values()) {
            pointers.add(player);
        }
        pointers.sort(new PlayerComparator());
        Iterator<Players> i = pointers.iterator();
        // for (Players player: Players.values()) {
        //     stringer += player.toString() + ": " + player.getPoints() + "\n";
        // }
        while (i.hasNext() == true) {
            Players player = i.next();
            stringer += player.toString() + ": " + player.getPoints() + "\n";
        }
        FileWriter fileWriter = new FileWriter(new File("export2.txt"));
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(stringer);
        writer.close();
        fileWriter.close();
    }
}
