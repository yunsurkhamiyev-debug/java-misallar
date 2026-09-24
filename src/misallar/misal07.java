package misallar;
import java.util.Scanner;


public class misal07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a>0){
            System.out.println("Musbet");
        }if (a<0){
            System.out.println("Menfi");
        }if (a==0) {
            System.out.println("Sifir");
        }

    }
}
