package OOP_concepts.IDScanner_system;

public class Main {
    public static void main(String[] args){
        int[] initialIDs = {1001, 1002, 1003};

        SecurityScanner scanner = new SecurityScanner(initialIDs);

        boolean findID = scanner.searchID(9999);

        System.out.println(findID);
    }
}
