public class Config {
    public static String printRules() {
        return "Pick between ROCK, PAPER, or SCISSORS.";
    }

    // 0 = Draw, 1 = Player Wins, -1 = NPC Wins
    public static int calculateWinner(String pChoice, String npcChoice) {
        if (pChoice.equals(npcChoice)) {
            return 0; // Draw if both choices are the same
        } else if ((pChoice.equals("ROCK") && npcChoice.equals("SCISSORS")) || (pChoice.equals("PAPER") && npcChoice.equals("ROCK")) || (pChoice.equals("SCISSORS") && npcChoice.equals("PAPER"))) {
            return 1; // Player wins
        } else {
            return -1; // NPC wins
        }
    }

    public static String printOutcome(int result) {
        if (result == 1) {
            return "The Player Wins!";
        } else if (result == -1) {
            return "The Computer Wins!";
        } else {
            return "It's a Draw!";
        }
    }
}
