import java.util.Scanner;
public class CountNum{

static int  NumberOfOccurance(int arr[], int x){
    int count = 0;
    for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        count++;
    }
    }
    return count;
    }


    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int []arr = new int[n];
        System.out.print("enter"+n+"element: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.println("COUNT OF X :"+NumberOfOccurance(arr,x));
    }
}