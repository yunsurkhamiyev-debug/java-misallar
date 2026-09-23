package misallar;
import java.util.Scanner;


public class misal8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yas=scanner.nextInt();
        if (yas<=12){
            System.out.println("Usaq");
        }if (yas>12 && yas<18){
            System.out.println("yeniyetme");
        }if (yas>=18){
            System.out.println("yetgin");
        }

    }
}
