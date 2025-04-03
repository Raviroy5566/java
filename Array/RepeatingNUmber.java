import java.util.Scanner;

public class RepeatingNUmber {
    static  int firstRepeating(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] == arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int []arr= new int[n];
        System.out.println("enter "+n+" Element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(" first Repeating number is: "+firstRepeating(arr));

    }
}
