import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        int ans =0;
        int pw = 1;
        while (num>0){
            int unit_digit = num%2;
            ans +=(unit_digit*pw);
            pw *=10;
            num /=2;
        }
        System.out.println("binary number is : "+ans);
    }
}
