
import java.util.Scanner;

public class StringChapter {
    public static void pattern(int n){
        char chars='A';
        for(int i=0;i<n;i++){
            for(int k=n-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++,chars++){
                System.out.print(chars+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
