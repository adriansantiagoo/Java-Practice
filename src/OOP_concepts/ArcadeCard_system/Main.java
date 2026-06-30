package OOP_concepts.ArcadeCard_system;

public class Main {
    public static void main(String[] args){
        ArcadeCard card1 = new ArcadeCard("Silver", 20, 0);
        ArcadeCard card2 = new ArcadeCard("Copper");

        int gameCost = 10;
        int gameTicketsWon = 50;
        card2.playStandardGame(gameCost,gameTicketsWon);
        card1.playStandardGame(gameCost, gameTicketsWon);
        System.out.println();

        int amount = 10;
        card2.loadCredits(amount);

        card1.playMegaJackpot(false);
        card2.playMegaJackpot(true);
        System.out.println();

        System.out.println("The total tickets dispensed are " + ArcadeCard.totalTicketsDispensed);
    }
}
