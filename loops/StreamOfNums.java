import java.util.Enumeration;
import java.util.Scanner;

public class StreamOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = sc.nextInt();
        int sum =0;
        do{
            sum = sum+num;
            num = sc.nextInt();
        }while (num!=-1);


//        while (num!=-1){
//            sum+=num;
//            num= sc.nextInt();
//        }
       System.out.println(sum);
    }
}
