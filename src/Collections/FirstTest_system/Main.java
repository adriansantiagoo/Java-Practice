package Collections.FirstTest_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many foods do you want? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        ArrayList<String> fruits = new ArrayList<>();

        for (int i = 0; i < quantity; i++){
            System.out.print("Enter a fruit: ");
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }

        System.out.println(fruits);

        sc.close();
    }
}
