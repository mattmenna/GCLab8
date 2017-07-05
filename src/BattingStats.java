import java.util.Scanner;

/**
 * Created by Matt on 7/5/2017.
 */
/*
Calculate the batting average and slugging percentage for one or more baseball/softball players.
First ask for the number of at bats
For eah at bat ask the user for the number of bases earned by the batter.
After all of the at-bats are entered, display the batting average and slugging percentage of the batter.
 */

public class BattingStats {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Batting Statistics");

        OOValidator validator = new OOValidator();

        System.out.println("Whats the player's name?:");
        String pName = scnr.nextLine();

        int numAtBats = validator.getInt("How many at bats?");
        int[] bases = new int[numAtBats];

        for (int i = 0; i < bases.length; i++) {
            System.out.println(i);
            bases[i] = validator.getInt("How many bases?");
        }

    }
}
