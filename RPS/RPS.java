class RPS {
    public static void main(String args[]) {
        System.out.println(Config.printRules());

        Player player = new Player();
        player.getPcChoice(); // Get player's choice as a string
        String pChoice = player.getChoice(); // Store player's choice

        Player npc = new Player();
        npc.getNpcChoice(); // Get NPC's choice as a string
        String npcChoice = npc.getChoice(); // Store NPC's choice

        int result = Config.calculateWinner(pChoice, npcChoice); // Calculate the result
        System.out.println("Player chose: " + pChoice);
        System.out.println("NPC chose: " + npcChoice);
        System.out.println(Config.printOutcome(result));
    }
}
