package telran.controller;

import telran.data.User;

import java.util.Scanner;

public class UserApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user1 = new User("Gena", 3457);
        User user2 = new User("Luisa", 2345);
        User user3 = new User("Martin", 6834);
        User user4 = new User("Jon", 1290);
        User user5 = new User("July", 7272);

        User[] users = {user1, user2, user3, user4, user5};
        String nameUser = getNameFromUser();
        userCollaboration(users, nameUser);

        //userCollaboration(users, "Gena");

        scanner.close();
    }

    private static String getNameFromUser(){
        System.out.println("Please enter your name");
        return scanner.nextLine();
    }

    private static int operationChoice(){
        System.out.println("If you want get your secret code, enter 1");
        System.out.println(("If you want change your name, enter2"));
        return scanner.nextInt();
    }

    private static void updateUser(User user) {
        System.out.println("Enter your code, please");
        int secretCode = scanner.nextInt();
        if (user.checkSecretCode(secretCode)) {
            System.out.println("Please enter your new name");
            String newName = scanner.next();
            user.setName(newName);
            System.out.println("Your name is " + user.getName() + " now");
        } else {
            System.out.println("sorry, secret code is wrong");
        }
    }

    private static void makeUserOperationChoice(int operation, User user){
        switch (operation){
            case 1:
                System.out.println(user.getSecretCode());
                break;
            case 2:
                updateUser(user);
                break;
            default:
                System.out.println("wrong operation number");
        }
    }

    private static void userCollaboration(User[] users, String name){
        User user = User.getUserByName(users, name);
        if(user!=null){
            System.out.println("Hello dear " + name + "!");
            int operation = operationChoice();
            makeUserOperationChoice(operation, user);
        }else{
            System.out.println("sorry, we don't know you");
        }
    }


 /*   private static void userCollaboration(User[] users, String name){
        if(User.getUserByName(users, name)==null){
            System.out.println("sorry, we don't know you");
        }else{
            System.out.println("Hello dear " + name + "!");
            int operation = operationChoice();
            makeUserOperationChoice(operation, User.getUserByName(users, name));
        }
    }*/

}
