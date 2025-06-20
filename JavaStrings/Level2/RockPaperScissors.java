package JavaStrings.Level2;

import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("scissors") && comp.equals("paper")) ||
                (user.equals("paper") && comp.equals("rock")))
            return "User";
        return "Computer";
    }

    public static void playGame(int rounds) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i+1) + " - Enter (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println("Computer chose: " + comp + " | Winner: " + winner);
        }

        System.out.println("\n--- Game Summary ---");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / rounds));
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0 / rounds));
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rounds do you want to play? ");
        int rounds = sc.nextInt();
        playGame(rounds);
    }
}
