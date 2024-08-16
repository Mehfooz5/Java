import java.util.Scanner;
public class Add {

    public static void main(String[] args){
        int num1,num2,sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number :");
        num1 = obj.nextInt();
        System.out.println("Enter second number :");
        num2 = obj.nextInt();
        sum = num1+num2;
        System.out.println("Sum of two numbers is :" + sum);
    }
}