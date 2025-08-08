package Day3;
import java.util.Scanner;
public class Access{
    public static void main(String[] args) {
        Bank b = new Bank();

       /* b.deposit(5000);
        b.withdraw(3000);

        System.out.println("Balance: " + b.getBalance());*/
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        b.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        b.withdraw(withdrawAmount);

        System.out.println("Final Balance: ₹" + b.getBalance());
        
        sc.close();
       
        
        
    }
}
