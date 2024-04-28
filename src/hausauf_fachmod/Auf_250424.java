
package hausauf_fachmod;

import java.util.Scanner;

public class Auf_250424 {
	
	public void runButton() {
		
		try (Scanner keyboard = new Scanner(System.in)) {
			String First, Second, Third, Fourth;
			
			{

				System.out.println("PUSH THE BUTTON");
				System.out.println("  ");
				System.out.println("There's a button on the table. Do you press it? 'Yes' or 'No'?");
				System.out.print("> ");
			}

			{
				First = keyboard.next();

				if (First.equalsIgnoreCase("Yes")) {
					System.out.println("  ");
					System.out.println("Nothing happens. Maybe you shouldn't have touched it.");
					//Try again
				} else if (First.equalsIgnoreCase("No")) {
					System.out.println("  ");
					System.out.println("A second button appears, as the first one sinks into the table. Do you press it? 'Sure' or 'nah'?");
					System.out.print(" > ");
				}

				Second = keyboard.next();

				if (Second.equalsIgnoreCase("Sure")) {
					System.out.println("  ");
					System.out.println("The button glows red. Do you press it again? 'Whatever' / 'Nope' ");
					System.out.print(" > ");
				} else if (Second.equalsIgnoreCase("Nah")) {
					System.out.println("Nothing happens. Well.");
					// Try again
				}
				
				Third = keyboard.next();

				if (Third.equalsIgnoreCase("Whatever")) {
					System.out.println("  ");
					System.out.println("Nothing happens. You get bored.");
					// Try again
					
				}
				else if (Third.equalsIgnoreCase("Nope")) {
					System.out.println("  ");
					System.out.println("The button lifts off from the table but seems stable. Do you press it now? 'Okay' / 'Nooo' ");
					System.out.print(" > ");
				}

				Fourth = keyboard.next();

				if (Fourth.equalsIgnoreCase("Okay")) {
					System.out.println("  ");
					System.out.println("Nothing happens. As you open the door to leave the room, the world outside is gone. Is this space? Whatever it is, it kills you quickly.");
				}

				else if (Fourth.equalsIgnoreCase("Nooo")) {
					System.out.println("  ");
					System.out.println("Nothing happens, the button doesn't do a thing if you don't touch it. Well, that was a waste of time.");
					//Try again?
				}
			}
		}
		
	}
}


//Copilot über "try again"
//
//package hausauf_fachmod;
//
//import java.util.Scanner;
//
//public class Auf_250424 {
//    public static void main(String[] args) {
//        Auf_250424 game = new Auf_250424();
//        game.startGame();
//    }
//
//    public void startGame() {
//        Scanner keyboard = new Scanner(System.in);
//        boolean keepPlaying = true;
//
//        while (keepPlaying) {
//            // Game logic goes here
//            String firstMove = getUserInput(keyboard, "There's a button on the table. Do you press it? 'Yes' or 'No'?");
//            processFirstMove(firstMove, keyboard);
//
//            // Ask if the user wants to play again
//            System.out.println("Do you want to start over? 'Yes' or 'No'");
//            String playAgain = keyboard.next();
//            if (!playAgain.equalsIgnoreCase("Yes")) {
//                keepPlaying = false;
//            }
//        }
//
//        keyboard.close();
//    }
//
//    private String getUserInput(Scanner keyboard, String message) {
//        System.out.println(message);
//        System.out.print("> ");
//        return keyboard.next();
//    }
//
//    private void processFirstMove(String firstMove, Scanner keyboard) {
//        if (firstMove.equalsIgnoreCase("Yes")) {
//            // Process the "Yes" move
//        } else if (firstMove.equalsIgnoreCase("No")) {
//            // Process the "No" move
//        }
//        // Continue with the rest of the game logic
//    }
//
//    // Additional methods to process other moves
//}
