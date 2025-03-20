import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("found ans -"+num);
        }
    }
}
