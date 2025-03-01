import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your lucky number");
//        int num1= sc.nextInt();
//        System.out.println("your lucky number is :" +num1);
//
//        System.out.println("enter your name ");
//        String name = sc.nextLine();
//        System.out.println("your name is :"+name);


        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("sum = "+sum);
    }
}
