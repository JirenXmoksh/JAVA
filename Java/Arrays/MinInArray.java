import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     System.out.print("Enter the size of array: ");
     int n = sc.nextInt();
     int arr[] = new int[n];

     System.out.println("Enter elements: ");
     for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
     }
     System.out.println("The array is: ");
     for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();

     int min = Integer.MAX_VALUE;
     for(int i=0; i<n; i++){
        if(arr[i]<min){
            min = arr[i];
        }        
     }
     System.out.println(min+" is the minimum value in the array");


     sc.close();
    }
}
