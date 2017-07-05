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
        int numbOfHits = 0;
        int slug = 0;

        for (int i = 0; i < bases.length; i++) {
            //System.out.println(i);
            bases[i] = validator.getInt("Please enter the number of bases for at bat number" + (i+1));
            if(bases[i]>= 1){
                numbOfHits += bases[i];
            }
            slug += bases[i];

        }


        float battingAvg = (numbOfHits/numAtBats)*100;
        float sluggingPct = (slug/numAtBats)*100;

        System.out.printf("%s  had a batting average of %.3f\n", pName, battingAvg);
        System.out.printf("%s  had a slugging percentage of %.3f", pName, sluggingPct);

    }
}
