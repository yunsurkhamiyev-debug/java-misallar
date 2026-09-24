package misallar;
import java.util.Scanner;

public class misal17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int s=0;
        int eded;
        while (true){
            eded=scanner.nextInt();
            if (eded==0){
                break;
            }
            s+=1;
        }
        System.out.println(s);


    }
}
