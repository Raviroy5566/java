import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a binary number : ");
        int num = sc.nextInt();

        int ans = 0;
        int pw = 1;

        while (num>0){
            int unit_digit = num%10;
            ans += (unit_digit*pw);
            num /= 10;
            pw *= 2;
        }
        System.out.println("Decimal number is "+ans);

    }
}
