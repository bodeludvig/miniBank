import java.util.Scanner;

//Metod för att visa huvudmeny
//Lägg till en loop för att hantera meny
//Switch eller if-else för menyval

public class Menu {

    boolean exit; //default as false

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            preformAction(choice);
        }
    }

    private void printHeader() {
        System.out.println("Welcome to your epic bank!");
    }

    private void printMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Create an account");
        System.out.println("2. Login to your account");
        System.out.println("3. Close application");
    }

    private int getInput() {
        Scanner userInput = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice > 3) {
            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(userInput.nextLine());
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }

    private void preformAction(int choice) {
        switch (choice) {
            case 1:
                createAccount();
            case 2:
                //login();
                break;
            case 3:
                exit = true;
                System.out.println("Thank you for using our application!");
                break;
            default:
                System.out.println("An unknown error has occurred.");
        }
    }

    private void createAccount() {
        Scanner userInputName = new Scanner(System.in);
        System.out.print("Enter an username: ");
        String userName = userInputName.nextLine();

        Scanner userInputPass = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String userPass = userInputPass.nextLine();

        System.out.println("Your username is: " + userName + " and your password is: " + userPass);
    }
}
