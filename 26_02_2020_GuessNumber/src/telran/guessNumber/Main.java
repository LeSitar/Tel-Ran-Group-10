package telran.guessNumber;

import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Guess the number");
        int range = 10;
        int number = (int)(Math.random()*10);
        while (true){
            System.out.println("My number is from 0 but less " + range);
            int inputNumber = scanner.nextInt();
            if(inputNumber==number){
                System.out.println("Bingo!!!");
                break;
            }
            else if(inputNumber>number){
                System.out.println("my number is less");
            }else {
                System.out.println("my number is greater");
            }
        }
        scanner.close();
    }
}
