package ProgrammingLogic.GridCleaner_system;

public class Robot {
    private int row = 0;
    private int col = 0;
    private int score = 0;


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getScore() {
        return score;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void addScore(int points){
        this.score += points;
    }
}
