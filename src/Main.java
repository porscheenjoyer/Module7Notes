import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA = " ";
        String playerB = " ";

        playerA = playerMove(in, "What is player A move?");

        playerB = playerMove(in, "What is player B move?");

        System.out.println("Player A mover is: " + playerA);

        System.out.println("Player B move is: " + playerB);

    }

    private static String playerMove(Scanner pipe, String message) {

        String move;

        while(true) {

            System.out.println(message);

            move = pipe.nextLine();

            if (move.equalsIgnoreCase("r") || move.equalsIgnoreCase("p") || move.equalsIgnoreCase("s")) {

                break;

            }

            else {

                System.out.println("Incorrect, try again");

            }

        }

        return move;

    }

}