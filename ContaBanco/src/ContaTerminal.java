import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in); 
        System.out.println("Welcome for Bank in Java!");
        System.out.println("Please, put your number of agency below:");
        var Agency = scanner.nextInt();
        System.out.println("Please, put your number of account below:");
        var AccountNumber = scanner.next();
        System.out.println("Please, put your name below:");
        var Name = scanner.nextLine();
        Name += scanner.nextLine();
        System.out.println("Please, put your balance below:");
        var Balance = scanner.nextDouble(); 
        System.out.printf("Hello, %s! Thank you for creating an account in our bank, your agency is %s, your account is %s and your balance is %s",
                          Name, Agency, AccountNumber, Balance);
    }
}
