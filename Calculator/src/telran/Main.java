package telran;

import java.util.Scanner;

import static telran.Calculator.*;
import static telran.Dialog.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);

        double a = getParameter(scanner);
       //System.out.println(a);
        double b = getParameter(scanner);

        char operation = operationChoice();


        calculation(a,b,operation);

        scanner.close();



    }
}
