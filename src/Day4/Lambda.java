package Day4;
import java.util.Scanner;
interface Calculator {
 int cal(int a, int b);
}

public class Lambda {
	public void perform() {
	 Scanner sc = new Scanner(System.in);

      
     System.out.println("Enter First number : " );     
     int num1=sc.nextInt();
     System.out.println("Enter second number : "); 
     int num2=sc.nextInt();
     
     Calculator add = (a, b) -> a + b;
     Calculator multiply = (a, b) -> a * b;
     Calculator divide = (a, b) -> {
         if (b == 0) return 0;
         return a / b;
     };

     System.out.println("Addition: " + add.cal(num1, num2));
     System.out.println("Multiplication: " + multiply.cal(num1, num2));
     System.out.println("Division: " + divide.cal(num1, num2));
 }
}


