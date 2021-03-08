import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        final String PASSWORD = "Test";
        Scanner in = new Scanner(System.in);
        int userChoice = 0;
        int attempts = 3;
        String password = "";
        boolean quit = false;
        float balance = 0f;
        float amount = 0;

        while (attempts-- > 0 && !PASSWORD.equals(password)) //compares and then decrements
        {
            System.out.print("Enter your password: ");
            password = in.nextLine();
            if (password.equals(PASSWORD)) {
                System.out.println("Welcome");
                do{
                    System.out.println("1. Deposit Money");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Check Balance");
                    System.out.println("Your choice. 0 to quit: ");
                    userChoice = in.nextInt();
        
                switch (userChoice){
                    case 1:
                      //  deposit money
                    System.out.println("Amount to deposit: ");
                        amount = in.nextFloat();
                        balance += amount;
                        break;
        
                    case 2:
                    //  withdraw money
                    System.out.println("Amount to withdraw: ");
                    amount = in.nextFloat();
                    balance -= amount;
                    break;
        
                    case 3:
                     // check balance
                        System.out.println("Your balance: R " + balance);
                        break;
        
                    case 0 :
                        quit = true;
                        break;
        
                    default:
                        System.out.println("You have entered an invalid option!");
                        break;
        
                }
        
                // System.out.println();
                if(userChoice == 0)
                    quit = true;
                    System.out.println("Bye!");
                } while(!quit);
            }
            else{
                System.out.println("Incorrect. Number of attempts remaining: " + attempts);
            }
            
        }   

        in.close();
    }

}