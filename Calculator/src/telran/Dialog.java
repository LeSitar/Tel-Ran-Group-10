package telran;

import java.util.Scanner;

public class Dialog {

    public static double getParameter(Scanner scanner){
        System.out.println("Enter number");
        return scanner.nextDouble();
    }

    public static char operationChoice()throws java.io.IOException {
        System.out.println("Enter operation symbol");
        char operation =(char)System.in.read();
        while (operation!='+' && operation!='-' && operation!='*'&& operation!='/'){
            System.out.println("wrong operation, enter new symbol!");
            operation=(char)System.in.read();

        }
        return operation;
    }

    public static char operationChoice2(Scanner scanner){
        System.out.println("Enter operation symbol");
        char operation = scanner.next().charAt(0);
        while (operation!='+' && operation!='-' && operation!='*'&& operation!='/'){
            System.out.println("wrong operation, enter new symbol!");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

}
