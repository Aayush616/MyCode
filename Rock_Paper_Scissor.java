import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        /*
            0 for Rock
            1 for Paper
            2 for Scissor
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Let's Play the Game");
        System.out.println(" Enter 0 for Rock\n Enter 1 for Paper\n Enter 2 for Scissor");
        System.out.print("Your Choice : ");
        int userInput=sc.nextInt();
        Random random =new Random();
        int computerInput= random.nextInt(3);
        System.out.println("Computer Choice : "+computerInput);    
            if(userInput==computerInput)
            {
                System.out.println("Draw!");
            }
            else if(userInput==0 && computerInput==2||userInput==1 && computerInput==0|| userInput==2 && computerInput==1)
            {
                System.out.println("YOU WIN!");
            }
            else
            {
                System.out.println("COMPUTER WIN!");
            }
        
    }
}
