//We are playing the Guess Game. The game is as follows:
//I pick a number from 1 to n. You have to guess which number I picked.
//Every time you guess wrong, I will tell you whether the number I picked is
// higher or lower than your guess.

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 8;
        int n = 0;

        for (int i = 0; n != guess ; i++) {


            System.out.println("guess a number from 0-n");
             n = in.nextInt();

             if (guess > n)
                System.out.println("you guessed less than the intended number");

            else if(guess < n)
                System.out.println("you guessed higher than the intended number");

        }
        if (guess == n)
            System.out.println("you guessed it right:) it is" + n);
    }
}
