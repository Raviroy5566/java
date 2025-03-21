import java.util.Scanner;

public class sumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        int sum =0;
        for(int num =1; num<=n; num++){
            sum = sum+num;

        }
        System.out.println("total sum of up to n is "+sum);
    }
}
