package misallar;
import java.util.Scanner;
public class misal14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int s=0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                s+=1;

            }
        }
        System.out.println(s);


    }
}
