import java.util.Scanner;

public class PrintFactorialsTilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter till where you want your factorials: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
            System.out.println(i+ "! : "+fact);
        }
sc.close();
    }
}
