import java.io.*; 
import java.util.*;

public class SortTxtWithUserComparator {

    public static void main(String[] args) throws Exception {

        String originalFile = "temp.txt";
        String progressFile = "progress.txt";

        File original = new File(originalFile);
        BufferedReader br = new BufferedReader(new FileReader(original));

        List<String> lines = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line); 
        }

        br.close();

        // Make a copy to randomize
        List<String> randomizedLines = new ArrayList<>(lines);   

        // Randomize the copy
        Collections.shuffle(randomizedLines);

        sortWithSaving(randomizedLines, progressFile);      
    }

    public static void sortWithSaving(List<String> lines, String progressFile) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int index = 0;
        
        while(index < lines.size()-1) {
        
            String str1 = lines.get(index);
            String str2 = lines.get(index+1);
            
            // Prompt user  
            System.out.print("Which do you prefer: " + str1 + " or " + str2 + "? ");            
            int choice = scanner.nextInt();
            
            // Swap items if needed
            if (choice == 2) {
                lines.set(index, str2);
                lines.set(index+1, str1); 
            }
            
            index++;
            
            // Offer to save progress 
            System.out.print("Save progress (y/n)? ");
            String saveChoice = scanner.next();
            
            if(saveChoice.equalsIgnoreCase("y")) {
                saveProgress(lines, progressFile); 
            }
        }
        
        scanner.close();
    }

    public static void saveProgress(List<String> lines, String file) throws Exception {
        PrintWriter out = new PrintWriter(file);
        for(String line : lines) {
            out.write(line + System.lineSeparator());
        }
        out.close();
    } 
}