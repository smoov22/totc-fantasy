package draft_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 * Updates the "export.txt" file in accordance with the Hot 100 text document currently listed in formatter.py
 * @author Kyle Mullen, 2022
 */
public class Updater {
    /**
     * Adds points to each artist as indicated by the imported and formatted hot 100
     * @param values a map of artists and points
     * @param filename The Hot 100 text file (found in \hot100), as formatted by formatter.py, being used to add values
     * @return updated values file
     * @throws FileNotFoundException
     * @throws IOException
     */
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
            /**
             * creates a map of the enumeration of artists with the number of points they earned from the relevant chart
             * This map does not take into account any multipliers the artist has
             */
            String[] linepieces = line.split("; ");
            int value = Integer.parseInt(linepieces[0]);
            int points = 101 - Integer.parseInt(linepieces[0]);
            if (value < 11) {
                points += 10; // bonus points for songs in top 10
            }
            else if (value < 21) {
                points += 5; // bonus points for songs in top 20
            }
            else if (value < 41) {
                points += 2; // bonus points for songs in top 40
            }
            String artist = linepieces[2];
            for (Artists artists: Artists.values()) {
                if (artist.toLowerCase().contains(artists.toName().toLowerCase())) {
                    values.put(artists.toString(), points + values.get(artists.toString()));
                }
            }
            line = reader.readLine();
        }
        reader.close();
        fileReader.close();
        return values;
    }
    /**
     * Alternate value maker used early on that asks for manual inputs of each artist's points
     * @param values a map of artists
     * @return a map of artists with points
     */
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
    /**
     * Given a player, adds the divided up points of 5 artists to the player's total points, 
     * then returns the map of player name to points with the change made
     * @param values map of players to points
     * @param players the enumeration of players
     * @param player a single player
     * @param artist1 their first artist pick
     * @param artist2 their second artist pick
     * @param artist3 their third artist pick
     * @param artist4 their fourth artist pick
     * @param artist5 their fifth artist pick
     * @return the updated map
     */
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
        /**
         * Creates a zeroed map of all artists in the enumeration
         */
        Map<String, Integer> values = new HashMap<>();
        for (Artists artists: Artists.values()) {
            values.put(artists.toString(), 0);
        }
        /**
         * Converts the previous export into the current artist map, or else creates a zeroed map
         */
        FileReader fileReader = new FileReader("C:/Users/smoov/OneDrive - rit.edu/totc-fantasy/draft_1/export.txt");
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
        else {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split(": ");
                players.put(parts[0], Integer.parseInt(parts[1]));
                line=bufferedReader.readLine();
            }
        }
        fileReader.close();
        System.out.println(players);
        /**
         * Retrieves the values for each artist, then uses playerput on each player
         */
        try {
        // PythonInterpreter interpreter = new PythonInterpreter();
        // interpreter.execfile("alt-alt-formatter.py");
        // interpreter.close();
        values = valueFromFile(values, "C:/Users/smoov/OneDrive - rit.edu/totc-fantasy/temp.txt");
        } catch (IOException io) {
            System.out.println("IO exception");
        }
        players = playerPut(values, players, Players.SMOOV, Artists.MORGANWALLEN, Artists.KACEY, Artists.JCOLE, Artists.LAINEY, Artists.TATE); //done
        players = playerPut(values, players, Players.SCRUBS, Artists.PESO, Artists.RED, Artists.RODWAVE, Artists.ZACHBRYAN, Artists.NOAH);
        players = playerPut(values, players, Players.RIVER, Artists.PARMALEE, Artists.WEEKND, Artists.TYLER, Artists.KANEBROWN, Artists.DUSTIN);
        players = playerPut(values, players, Players.MATT, Artists.DRAKE, Artists.DUALIPA, Artists.MITSKI, Artists.TWENTYONESAVAGE, Artists.YEAT);
        players = playerPut(values, players, Players.LUIS, Artists.OLIVIARODRIGO, Artists.LILNASX, Artists.SZA, Artists.EDSHEERAN, Artists.JUNGKOOK);
        players = playerPut(values, players, Players.IVY, Artists.FUERZA, Artists.BADBUNNY, Artists.ICESPICE, Artists.DOJACAT, Artists.OLIVERANTHONY);
        players = playerPut(values, players, Players.HIDBID, Artists.TRAVISSCOTT, Artists.LUKECOMBS, Artists.JELLY, Artists.GUNNA, Artists.BAILEYZIMMERMAN);
        players = playerPut(values, players, Players.BIGG, Artists.TAYLORSWIFT, Artists.REMA, Artists.MILEY, Artists.NICKI, Artists.LILDURK);
        /**
         * Creates a new export in which all players are in order from most to least points, then exports it
         */
        String stringer = "Total points:\n";
        List<Players> pointers = new LinkedList<>();
        for (Players player: Players.values()) {
            pointers.add(player);
        }
        pointers.sort(new PlayerComparator());
        Iterator<Players> i = pointers.iterator();
        while (i.hasNext() == true) {
            Players player = i.next();
            stringer += player.toString() + ": " + player.getPoints() + "\n";
        }
        FileWriter fileWriter = new FileWriter(new File("C:/Users/smoov/OneDrive - rit.edu/totc-fantasy/draft_1/export.txt"));
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(stringer);
        writer.close();
        fileWriter.close();
    }
}
