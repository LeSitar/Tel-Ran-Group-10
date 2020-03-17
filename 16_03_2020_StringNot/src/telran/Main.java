package telran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println(changeString("found"));

        System.out.println("Please enter a word");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(startWithNot(userInput) ? removeNot(userInput) : addNot(userInput));

    }

    public static String changeString(String str){
        if(str.startsWith("not")){
           return str.substring(3) + "not";
        }else{
            return  "not" + str;
        }
    }

    private static boolean startWithNot(String input){
        return input.startsWith("not");
    }

    private static String addNot(String input){
        return "not" + input;
    }

    private static String removeNot(String input){
        return input.substring(3) + "not";
    }
}
