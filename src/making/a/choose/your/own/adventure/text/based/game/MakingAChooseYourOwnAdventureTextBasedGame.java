/*
 * Making a Choose Your Own Adventure Text-Based Game.
 * Jessica Qiao
 * 16/10/2018
 */

package making.a.choose.your.own.adventure.text.based.game;
import java.util.Scanner;

/**
 *
 * @author shqia0005
 */
public class MakingAChooseYourOwnAdventureTextBasedGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        String answer1, answer2, answer3, answer4;
        
        System.out.println("Let's factor a quadratic expression together!");
        System.out.println("Enter your answer!");
        System.out.println("Here is the example:");
        System.out.println(" x² + 5x + 8 = 2 ");
        
        System.out.println("Would you like to move '2' to left side?");
        answer1 = keyedInput.nextLine();
        switch (answer1){
            case "Yes": case "yes": case "Y": case "y":
            System.out.println("You got x² + 5x + 6 = 0 ");break;
            case "No": case "no": case "N": case "n":
            System.out.println("Please move '2' to left side first.");break;
    }
        System.out.println("Is it factor to (x + 2) and (x + 3)?");
        answer2 = keyedInput.nextLine();
        switch (answer2){
            case "Yes": case "yes": case "Y": case "y":
            System.out.println("You got (x + 2)(x + 3) = 0");break;
            case "No": case "no": case "N": case "n":
            System.out.println("You are incorrect, please check it angin.");break;
    }
        System.out.println("Is it solved by x + 2 = 0 and x + 3 = 0?");
        answer3 = keyedInput.nextLine();
        switch (answer3){
            case "Yes": case "yes": case "Y": case "y":
            System.out.println("You are Correct!");break;
            case "No": case "no": case "N": case "n":
            System.out.println("You are incorrect, please check it angin.");break;
    }
        System.out.println("Is your answer x=2 or x=3?");
        answer4 = keyedInput.nextLine();
        switch (answer4){
            case "Yes": case "yes": case "Y": case "y":
            System.out.println("You are successful!");break;
            case "No": case "no": case "N": case "n":
            System.out.println("You are incorrect, please check it angin.");break;
    }
    
    }}
