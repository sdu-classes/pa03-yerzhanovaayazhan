import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadFile {

    public static String[] readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner fin = new Scanner(file);
        int lineCounter = 0;
        
        String[] lines = new String[1000];
        String line = null;
        while (fin.hasNextLine()) {
            line = fin.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }
        
        return lines;
    }

    public static void main(String[] args) {
        String filename = "input.txt";
        String absPath = "/code/sdu/pa03-satbekmyrza/12pm/problem-B/input.txt";
        String relPath = "test-dir/input.txt";
        String platformIndependentRelPath = "test-dir" + File.separatorChar + "input.txt"; // Best solution!
        try {
            String[] lines = readFile(relPath);
            for (String line : lines) {
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
