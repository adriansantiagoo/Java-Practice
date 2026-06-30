package OOP_concepts.IDScanner_system;

public class SecurityScanner {
    private int[] authorizedIDs;

    public SecurityScanner(int[] initialIDs){
        if (initialIDs == null || initialIDs.length == 0){
            throw new IllegalArgumentException("Database cannot be null or empty.");
        }
        this.authorizedIDs = initialIDs;
    }

    public boolean searchID(int target){
        for (int ID : authorizedIDs) {
            if (ID == target) return true;
        }
        return false;
    }
}
