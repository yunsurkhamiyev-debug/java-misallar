package misallar;
import java.util.Scanner;

public class misal20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eded=scanner.nextInt();
        int n=Math.abs(eded);
        int ters=0;
        while (n!=0){
            int sonreqem=n%10;
            ters=ters*10+sonreqem;
            n=n/10;
        }
        if (eded<0){
            ters=-ters;

        }
        System.out.println(ters);

    }
}
