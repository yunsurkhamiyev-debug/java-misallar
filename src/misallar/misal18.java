package misallar;
import java.util.Scanner;

public class misal18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eded=scanner.nextInt();
        int s=0;
        int n=Math.abs(eded);
        if (n==0){
            s=1;

        }else{
            while (n !=0){
                n=n/10;
                s++;

            }
        }
        System.out.println(s);

    }
}
