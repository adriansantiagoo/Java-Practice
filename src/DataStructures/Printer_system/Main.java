package DataStructures.Printer_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Printer printer = new Printer();

        printer.displayQueue();

        System.out.print("How many documents? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.print("Enter the document: ");
            String documentName = sc.nextLine();

            printer.enqueue(documentName);

            printer.displayQueue();
            printer.displayBackward();
        }

        sc.close();
    }
}
