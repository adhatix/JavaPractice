import java.util.Scanner;
import java.util.Random;

public class Player {
    private String choice;

    public void getPcChoice() {
        //TODO
        Scanner askChoice = new Scanner(System.in);
        boolean RPSsaid = false;
        while(RPSsaid == false) {
            choice = askChoice.nextLine().toUpperCase();
            if (choice.equals("ROCK") || choice.equals("PAPER") || choice.equals("SCISSORS")) {
                RPSsaid = true;
            } else {
                System.out.println("HEY LOSER ACTUALLY SAY ROCK, PAPER or SCISSORS");
            }
        }
    }

    public void getNpcChoice() {
        //TODO
        Random npcChoice = new Random();
        int npcPick = npcChoice.nextInt(3); // Randomly picks 0, 1, or 2
        if (npcPick == 0) {
            choice = "ROCK";
        } else if (npcPick == 1) {
            choice = "PAPER";
        } else {
            choice = "SCISSORS";
        }
    }

    public String getChoice() {
        return choice;
    }
}
