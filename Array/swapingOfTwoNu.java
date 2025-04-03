import java.util.Scanner;

public class swapingOfTwoNu {

    static void SwapWithoutTemp(int a,int b){
        System.out.println("before swap: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        a = a+b;
        b = a-b;
        a =a-b;

        System.out.println("after Swap: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

    static void swap(int a ,int b){
        System.out.println("before swap two number");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("after swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first Number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        SwapWithoutTemp(a,b);
    }
}

