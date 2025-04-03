import java.util.Scanner;

public class ReverseArray {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.println();
    }

    static int[] reverse(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];
        int j =0;

        for (int i = n-1;i>=0;i--){
            ans[j++] = arr[i];
        }
      return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter " + n + " Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[]ans = reverse(arr);
        System.out.println("Revese array is : ");
        printArray(ans);
    }
}
