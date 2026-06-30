package ProgrammingLogic.SortingBelt_system;

public class SortingGrid {
    private Package[][] grid;

    public SortingGrid(Package[][] initialGrid){
        this.grid = new Package[initialGrid.length][];
        for (int i = 0; i < initialGrid.length; i++){
            if (initialGrid[i] == null){
                continue;
            }
            this.grid[i] = new Package[initialGrid[i].length];
            for (int j = 0; j < initialGrid[i].length; j++){
                if (initialGrid[i][j] == null){
                    continue;
                }
                this.grid[i][j] = initialGrid[i][j];
            }
        }
    }

    public int calculateTotalGridWeight(){
        int sum = 0;

        for (Package[] packages : this.grid) {
            if (packages == null) {
                continue;
            }
            for (Package element : packages) {
                if (element == null) {
                    continue;
                }
                sum += element.getWeight();
            }
        }

        return sum;
    }

    public int findHeaviestBeltIndex(){
        int heaviestBeltIndex = 0;
        int maxWeight = -1; // Initializing to -1 ensures even a 0kg valid belt can update it

        for (int i = 0; i < this.grid.length; i++){
            if (this.grid[i] == null){
                continue;
            }

            int currentBeltWeight = 0;
            for (int j = 0; j < this.grid[i].length; j++){
                if (this.grid[i][j] == null){
                    continue;
                }
                currentBeltWeight += this.grid[i][j].getWeight();
            }

            if (currentBeltWeight > maxWeight){
                maxWeight = currentBeltWeight;
                heaviestBeltIndex = i;
            }
        }

        return heaviestBeltIndex;
    }
}
