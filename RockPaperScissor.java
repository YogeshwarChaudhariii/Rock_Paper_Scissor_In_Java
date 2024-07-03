import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            String [] availableMoves = {"Rock", "Paper", "Scissors"};
            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

            System.out.println("Computer has choosen its move");
            System.out.println();
            System.out.println("Now it's your turn to choose. Good Luck");
            System.out.println();

            String userMove;

            while (true) {
                System.out.println("Please choose your move from the availble match : 'Rock' 'Paper' 'Scissor'");
                System.out.println("Enter the move you choose: ");
                userMove = sc.nextLine();

                if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
                    System.out.println();
                    break;
                }

                System.out.println();
                System.out.println("Invalid Move..!");
                System.out.println("Please enter the move from the available move");
                System.out.println();
            }
            System.out.println("Computer chose : " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("Its a tie..!");
            }
            else if(userMove.equals("Rock")){
                if (computerMove.equals("Paper")) {
                    System.out.println("Computer Won..!");
                    System.out.println("Better Luck Next Time");

                }
            else if(computerMove.equals("Scissors")){
                System.out.println("You Won..!");
                System.out.println("Congratulations");

            }
            else if(userMove.equals("Paper")){
                if (computerMove.equals("Rock")) {
                System.out.println("You Won..!");
                System.out.println("Congratulations");
                }
                else if(computerMove.equals("Rock")){
                    System.out.println("Computer Won..!");
                    System.out.println("Better Luck Next Time");
                }
            }
            System.out.println();
            String playAgain;
            System.out.println("Do you want to play again..?");

            while (true) {
                System.out.println("Type 'yes' or 'no' ");
                playAgain = sc.nextLine();

                if (playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
                    System.out.println();
                    System.out.println("***********************************************************************************************************************");
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("Invalid Input");
                System.out.println();

            }
            if (playAgain.equals("no") || playAgain.equals("No")) {
                break;
            }
            }
        }
    }
}
