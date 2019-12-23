package tech.kcmodeveloper.netbeanswarmup;

public class Main {
        
    public static void main(String args[]){
        
        RNGuessingGame guessingGame = new RNGuessingGame();
        
        while(true){
            guessingGame.gameGenerator();          
        }
    }
}
