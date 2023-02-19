import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class SimpleIO {

    public static int countOccurences(String source, String substring) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = source.indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += substring.length();
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        // read filename
        Scanner in = new Scanner(System.in);

        // check filename
        // String filePath = "inputs" + File.separator + filename;
        // File file = new File(filePath);
        // if (!file.exists()) {
        //     System.out.println("Your file does not exist!");
        //     System.exit(1);
        // } else if (file.isDirectory()) {
        //     System.out.println("Your file is a directory!");
        //     System.exit(1);
        // }

        String inputFileName;
        File inputFile;
        while (true) {
            System.out.print("Please enter the name of the input file: ");
            inputFileName = in.nextLine();

            String filePath = "files" + File.separator + inputFileName;
            inputFile = new File(filePath);

            if (inputFile.exists() && !inputFile.isDirectory()) break;
        }

        String outputFileName;
        while (true) {
            System.out.print("Please enter the name of the output file: ");
            outputFileName = in.nextLine();

            if (!inputFileName.equals(outputFileName)) break;
        }
        File outputFile = new File(outputFileName);
        outputFile.createNewFile();
        
        Scanner inputScanner = null;
        PrintWriter printWriter = null;
        try {
            inputScanner = new Scanner(inputFile);
            printWriter = new PrintWriter(outputFile);
        } catch (FileNotFoundException exc) {}
        
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            int count = countOccurences(line, "the");
            printWriter.println(line + " [" + count + "]");
        }
        printWriter.close();
    }
}
