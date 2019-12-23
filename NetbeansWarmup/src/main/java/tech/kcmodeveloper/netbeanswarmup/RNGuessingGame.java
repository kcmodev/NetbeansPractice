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
        System.out.print("\nPick a number over 100 : ");
        
        int userChoice = userInput.nextInt();
// add an if statement here checking with .hasNextInt() then run the rest in the else statement?
        
        if (userChoice >= 100){
            System.out.println("Your number is between 1 and " + userChoice + ".");
            int answer = rand.nextInt(userChoice);
            
            int counter = 1;
            int userGuess;
            
            System.out.println("Time to start guessing...");
            
            while (true){
                System.out.println("Answer: " + answer);
                
                if (counter == 1){
                System.out.println("Enter your first guess: ");
                userGuess = userInput.nextInt();
                        if (userGuess > answer){
                            System.out.println("Too high! Try again.");
                            counter++;
                        } else if (userGuess < answer){
                            System.out.println("Too low! Try again.");
                            counter++;
                        } else if (userGuess == answer) {
                            System.out.println("Congrats it only took you one guess!!");
                            break;
                        } else {
                            System.out.println("Invalid input.");
                        }
                } else if (counter > 1){
                    System.out.println("Enter your next guess: ");
                    userGuess = userInput.nextInt();
                    
                    if (userGuess == answer){
                        System.out.println("You got it!");
                        System.out.println("You got it! It took you " + counter + " guesses.");
                        break;
                    } else if(userGuess != answer){
                        if (userGuess > answer){
                            System.out.println("Too high! Try again.");
                            counter++;
                        } else if (userGuess < answer){
                            System.out.println("Too low! Try again.");
                            counter++;
                        } else {
                            System.out.println("Invalid response.");
                        }
                    } else {
                        System.out.println("Invalid response.");
                    }
                }else {
                    System.out.println("Invalid response.");
                }
            }
        } else {
            System.out.println("Invalid response.");
        }
    }
}
