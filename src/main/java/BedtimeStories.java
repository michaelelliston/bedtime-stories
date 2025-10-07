import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);             //Initializing scanner, declaring variables
        String selection;
        FileReader fileReader;
        BufferedReader buffReader;
        LineNumberReader lineNumber;
        // Asking user for input and scanning it
        System.out.print("These are the stories currently available to read:\n\t1. Goldilocks\n\t2. Hansel and Gretel\n\t3. Mary Had a Little Lamb\nPlease input the number corresponding to the story you'd like to read: ");
        selection = myScanner.nextLine(); // storing user's input as selection

        try {     // try so that exceptions can get caught
            String input;
            int line;
            switch (selection) {      // switch based on user's selection
                case "1":
                    fileReader = new FileReader("src/main/resources/goldilocks.txt"); // reads the file at this location
                    buffReader = new BufferedReader(fileReader);
                    lineNumber = new LineNumberReader(fileReader); // reads the number for the currently read line
                    line = lineNumber.getLineNumber() + 1; // the +1 is so it doesn't start by saying line 0
                    while ((input = buffReader.readLine()) != null) { // loops printing each line as it gets read, placing line number first
                        System.out.printf("%d. %s\n", line, input);
                        line++;      // adds 1 to line
                    }
                    break;        // prevents running code from other cases
                    case "2":
                    fileReader = new FileReader("src/main/resources/hansel_and_gretel.txt");
                    buffReader = new BufferedReader(fileReader);
                    lineNumber = new LineNumberReader(fileReader);
                    line = lineNumber.getLineNumber() + 1;
                    while ((input = buffReader.readLine()) != null) {
                        System.out.printf("%d. %s\n", line, input);
                        line++;
                    }
                    break;
                    case "3":
                    fileReader = new FileReader("src/main/resources/mary_had_a_little_lamb.txt");
                    buffReader = new BufferedReader(fileReader);
                    lineNumber = new LineNumberReader(fileReader);
                    line = lineNumber.getLineNumber() + 1;
                    while ((input = buffReader.readLine()) != null) {
                        System.out.printf("%d. %s\n", line, input);
                        line++;
                    }
                    break;
                default:
                    System.out.println("Invalid selection.");     // displayed message upon inputting a number other than 1, 2, or 3
            }
        } catch(FileNotFoundException e) { // catches File Not Found exception
            System.out.println("Invalid input: " + e);
        } catch(IOException e) { // catches IO Exception
            System.out.println("IO exception occurred: " + e);
        }
    }

    }