package lesson4.loops;

import java.util.Scanner;

/**
 * Created by lolik on 18.12.2017.
 */
public class WhileConsoleExample {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your choice: ");
        int result = scanner.nextInt();
        while (result != 0){

            System.out.println("Wrong choice");
            Scanner sc = new Scanner(System.in);
            System.out.println("Type your choice: ");
            result = sc.nextInt();

        }




    }
}
