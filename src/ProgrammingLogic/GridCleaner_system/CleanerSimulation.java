package ProgrammingLogic.GridCleaner_system;

public class CleanerSimulation {
    private int[][] grid;
    private Robot robot;

    public CleanerSimulation(int[][] grid, Robot robot){
        if (grid == null){
            throw new IllegalArgumentException("The matrix cannot be null.");
        }
        if (grid[0].length == 0){
            throw new IllegalArgumentException("The matrix cannot be empty.");
        }
        if (grid[0][0] == -1){
            throw new IllegalArgumentException("The matrix cannot starts with -1.");
        }
        if (robot == null){
            throw new IllegalArgumentException("The robot cannot be null.");
        }
        this.grid = grid;
        this.robot = robot;
        if (grid[0][0] != 0){
            robot.addScore(grid[0][0]);
            grid[0][0] = 0;
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public Robot getRobot() {
        return robot;
    }
    private boolean isValidMove(int targetRow, int targetCol) {

        if (targetRow < 0 || targetRow >= grid.length) return false;

        if (targetCol < 0 || targetCol >= grid[targetRow].length) return false;

        if (grid[targetRow][targetCol] == -1) return false;

        return true;
    }

    public int runSimulation(char[] commands){
        int currentRow = this.robot.getRow();
        int currentCol = this.robot.getCol();

        for (char cmd : commands) {
            int nextRow = currentRow;
            int nextCol = currentCol;

            // 1. Calculate intended destination based ONLY on the command
            switch (cmd) {
                case 'R' -> nextCol++;
                case 'L' -> nextCol--;
                case 'D' -> nextRow++;
                case 'U' -> nextRow--;
                default  -> { continue; } // Ignore garbage commands safely
            }

            // 2. Validate the destination in one clean check
            if (isValidMove(nextRow, nextCol)) {
                // The current row and column change only if is a valid move
                currentRow = nextRow;
                currentCol = nextCol;

                // 3. Update state ONLY on successful movement
                this.robot.setPosition(currentRow, currentCol);
                this.robot.addScore(this.grid[currentRow][currentCol]);
                this.grid[currentRow][currentCol] = 0; // Clear the tile!
            }
        }

        return this.robot.getScore();
    }
}
