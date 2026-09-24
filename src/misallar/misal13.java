package misallar;
import java.util.Scanner;

public class misal13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int s=0;
        for (int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println(s);


    }
}
