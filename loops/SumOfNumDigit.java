import java.util.Scanner;

public class SumOfNumDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number ");
        int num =sc.nextInt();
        int count = 0;
        while(num>0){
            count = count+ num%10;
            num =num/10;
        }
        System.out.println("sum of num digit is: "+count);
    }
}
