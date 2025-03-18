import java.util.Random;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
String[] choices = {"rock", "paper", "scissors"};
while (true) {
// Get user input
System.out.print("\nEnter rock, paper, or scissors (or 'exit' to quit): ");
String userChoice = scanner.nextLine().toLowerCase();
// Exit condition
if (userChoice.equals("exit")) {
System.out.println("Thanks for playing! Goodbye!");
break;
}
// Validate user input
if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
continue;
}
// Computer's choice
String computerChoice = choices[random.nextInt(3)];
System.out.println("Computer chose: " + computerChoice);
// Determine winner
if (userChoice.equals(computerChoice)) {
System.out.println("It's a tie!");
}
else if (
(userChoice.equals("rock") &&
computerChoice.equals("scissors")) ||
(userChoice.equals("paper") &&
computerChoice.equals("rock")) ||
(userChoice.equals("scissors") &&
computerChoice.equals("paper"))
) {
System.out.println("You win! ");
} else {
System.out.println("You lose! ");
}
}
scanner.close();
}
}