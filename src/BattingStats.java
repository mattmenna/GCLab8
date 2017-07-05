
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
        OOValidator validator = new OOValidator();
        MyValidator stringValidator = new MyValidator();
        int numbOfHits = 0;
        int slug = 0;

        System.out.println("Welcome to Batting Average Calculator!\nWhats the player's name?:");
        String pName = scnr.nextLine();

        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

        int numAtBats = validator.getInt("Enter number of times at bat:");
        int[] bases = new int[numAtBats];

        for (int i = 0; i < bases.length; i++) {
            //System.out.println(i);
            bases[i] = validator.getInt("Result for at bat " + (i+1)+ ":");
            numbOfHits = getNumbOfHits(bases[i], numbOfHits);
            slug += bases[i];
        }

        float battingAvg = getBattingAvg(numAtBats, numbOfHits);
        float sluggingPct = getSluggingPct(numAtBats, slug);

        System.out.printf("%s had a batting average of %.3f\n", pName, battingAvg);
        System.out.printf("%s had a slugging percentage of %.3f", pName, sluggingPct);

    }

    private static float getSluggingPct(float numAtBats, float slug) {
        return (slug / numAtBats)*100;
    }

    private static float getBattingAvg(float numAtBats, float numbOfHits) {
        return (numbOfHits / numAtBats)*100;
    }

    private static int getNumbOfHits(int basis, int numbOfHits) {
        if(basis >= 1){
            numbOfHits += 1;
        }
        return numbOfHits;
    }
}
