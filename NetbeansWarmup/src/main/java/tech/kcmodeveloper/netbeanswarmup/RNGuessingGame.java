package tech.kcmodeveloper.netbeanswarmup;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class RNGuessingGame {
    
    public void gameGenerator(){
        
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("0.######");
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Let's play a guessing game...");
        System.out.print("\nPick a number between 1 - 500: ");
        
        int userChoice = userInput.nextInt();
        
        if (userChoice >= 1 && userChoice <= 500){
            
        } else {
            System.out.println("Invalid number. Please try again.");
        }
    }
}
