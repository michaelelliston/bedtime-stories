import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String selection;

        System.out.println("Please enter the number corresponding to the story you'd like to read:\n\t1. Goldilocks\n\t2. Hansel and Gretel\n\t3. Mary Had a Little Lamb");
        selection = myScanner.nextLine();
    }
}

