
import java.util.Scanner;

public class switchcalc {

    public static void main(String arg[]) {
        System.out.println("----------Simple calculation on two numbers----------");
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        float a = n.nextFloat();
        System.out.print("Enter 2nd number :");
        float b = n.nextFloat();
        System.out.print("Enter Operator +,-,*,/ :");
        String str = n.next();
        switch (str) {
            case "+":
                float add = a + b;      
                System.out.print("Sum is :");
                System.out.print(add);
                break;

            case "-":
                float diff = a - b;
                System.out.print("Difference is :");
                System.out.print(diff);

            case "*":
                float prod = a * b;
                System.out.print("Product is :");
                System.out.print(prod);

            case "/":
                float div = a / b;
                System.out.print("Quotient is :");
                System.out.print(div);
            default:
                System.out.println("Invalid Operator entered");
        }
    }
}
