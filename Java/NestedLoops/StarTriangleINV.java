import java.util.Scanner;

public class StarTriangleINV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int a = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }System.out.println();
            a--;
        }
        sc.close();
    }
}
