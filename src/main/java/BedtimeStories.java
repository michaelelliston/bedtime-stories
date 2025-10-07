import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String selection;

        System.out.println("Please enter the number corresponding to the story you'd like to read:\n\t1. Goldilocks\n\t2. Hansel and Gretel\n\t3. Mary Had a Little Lamb");
        selection = myScanner.nextLine();

        try {
            String input;
            switch (selection) {
                case "1":
                    FileReader fileReader = new FileReader("src/main/resources/goldilocks.txt");
                    BufferedReader buffReader = new BufferedReader(fileReader);
                    LineNumberReader lineNumber = new LineNumberReader(fileReader);
                    while ((input = buffReader.readLine()) != null) {
                        System.out.printf("%d. %s\n", lineNumber.getLineNumber(), input);

                    }
                case "2":
                    fileReader = new FileReader("src/main/resources/hansel_and_gretel.txt");
                    buffReader = new BufferedReader(fileReader);
                    while ((input = buffReader.readLine()) != null) {
                        System.out.println(input);
                    }
                case "3":
                    fileReader = new FileReader("src/main/resources/mary_had_a_little_lamb.txt");
                    buffReader = new BufferedReader(fileReader);
                    while ((input = buffReader.readLine()) != null) {
                        System.out.println(input);
                    }
                default:
                    System.out.println("Invalid selection.");
            }
        } catch(FileNotFoundException e) {
            System.out.println("Invalid input: " + e);
        } catch(IOException e) {
            System.out.println("IO exception occurred: " + e);
        }
    }

    }