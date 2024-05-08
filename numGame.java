import java.util.Scanner;
public  class numGame {
   

    public static  void guessNumGame(){

        int i=5;
        int j,guess;
        int number =(int)(100* Math.random());
        Scanner s =new Scanner(System.in);

        for(j=1;j<=i;j++){

            System.out.println("Guess a random number between 0-100 :");
            guess = s.nextInt();
            System.out.println("..................................");
            System.out.println();
            
            if(number == guess){
                System.out.println("..................................");
                System.out.println("Congratulations! you won the game.");
                System.out.println("..................................");
                System.out.println();
                break;
            }
            else if(number > guess  && j!=i){
                System.out.println("The number is larger than "+guess);
            }
            else if(number < guess && j!=i){
                System.out.println("The number is smaller than "+guess);
            }
            else if(number == guess-1 && j!=i){
                System.out.println("You are very near to win the game.");
            }
            else{
                System.out.println("Sorry!!! The given "+i+" trails are completed.");
                System.out.println("..................................");
                System.out.println();
               
            }
            

        }
      
        
        if(i==1){
            
            System.out.println();
            System.out.println("WOW! You scored 10 points!");
            System.out.println("..................................");
            System.out.println();
        }
        else if(i==2){
            System.out.println("..................................");
            System.out.println();
            System.out.println("You scored 8 points!");
            System.out.println("..................................");
            System.out.println();
            
        }
        else if(i==3){
            System.out.println("..................................");
            System.out.println();
            System.out.println("You scored 6 points!");
            System.out.println("..................................");
            System.out.println();
            
        }
        else if(i==4){
            System.out.println("..................................");
            System.out.println();
            System.out.println("You scored 4 points!");
            System.out.println("..................................");
            System.out.println();
        }
        else if(i==5){
            System.out.println("..................................");
            System.out.println();
            System.out.println("Oops! You lose the game.\n\nYou scored 0 points.\nTry Again to have fun!");
            System.out.println("..................................");
            System.out.println();
        }   
        else{

            System.out.println("..................................");
            System.out.println();
            System.out.println("Score 0");
            System.out.println();
            System.out.println("Play Again!");
            System.out.println("..................................");
            System.out.println();
        }
        System.out.println("Press '1' to play again (To exit -'0') ");
        int ch ;
        ch=s.nextInt();
        
       
        if(ch==1){

            guessNumGame();
          
        }
        else{

            System.out.println("..................................");
            System.out.println();
            System.out.println("***THANKYOU FOR PLAYING!***");
            System.out.println();
            System.out.println("..................................");
            System.out.println();
        
        }
       
       
    }
    
    
    public static void main(String[] args) {

        System.out.println("A number is randomly chosen between 1 to 100");
        System.out.println("..................................");
        System.out.println();
        System.out.println("Guess the number in 5 trials");
        System.out.println();
        System.out.println("..................................");
        System.out.println();
        guessNumGame();
        System.out.println();
       // System.out.println("Enter '1' to play again");
      
    }
    

}