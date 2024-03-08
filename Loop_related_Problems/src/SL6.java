//Write a program (WAP) for the described scenario:
//Player-1 picks a number X and Player-2 has to guess that number within N tries. For each wrong guess by Player-2, the program prints “Wrong, N-1 Choice(s) Left!” If Player-2 at any time successfully guesses the number, the program prints “Right, Player-2 wins!” and terminates right away. Otherwise after the completion of N wrong tries, the program prints “Player-1 wins!” and halts.
import java.util.Scanner;
public class SL6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int p1, p2, count = 3;
        boolean x=true;
        System.out.println("Player one pick a number: ");
        p1=input.nextInt();


        while (x)
        {
            System.out.print("Player two Guess a number: ");
            p2=input.nextInt();
            if (p2 == p1)
            {
                System.out.println("Right, player two wins!");
                break;

            }
            else if (p1 != p2)

            {
                System.out.println("Wrong "+count+" Choice(s) Left!");
            }

            if (count == 0)
            {
                System.out.println("Player-1 wins!");
                break;
            }
            count--;
        }
    }
}