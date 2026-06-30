package OOP_concepts.ArcadeCard_system;

public class ArcadeCard {
    String name;
    int credits;
    int tickets;
    static int totalTicketsDispensed;
    static int megaJackpot = 1000;

    ArcadeCard(String name, int credits, int tickets){
        this.name = name;
        this.credits = credits;
        this.tickets = tickets;
    }

    ArcadeCard(String name){
        this(name, 0, 0);
    }

    void loadCredits(int amount){
        this.credits += amount;
    }

    void playStandardGame(int cost, int ticketsWon){
        if (cost > this.credits){
            System.out.printf("Insufficient credits, %s!\n", this.name);
            return;
        }
        this.credits -= cost;
        this.tickets += ticketsWon;
        totalTicketsDispensed += ticketsWon;
        System.out.printf("Congrats! You won 50 tickets, %s!\n", this.name);
    }

    void playMegaJackpot(boolean won){
        if (5 > this.credits){
            System.out.printf("Insufficient credits, %s!\n", this.name);
            return;
        }
        this.credits -= 5;
        if (won){
            System.out.printf("BINGO! YOU WON %d TICKETS, %s!\n", megaJackpot, this.name);
            this.tickets += megaJackpot;
            totalTicketsDispensed += megaJackpot;
            megaJackpot = 500;
        }
        else {
            System.out.printf("Not this time, %s!\n", this.name);
            megaJackpot += 10;
        }
    }
}
