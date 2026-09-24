package misallar;
import java.util.Scanner;
public class misal11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        switch (n){
            case 1:
            case 2:
            case 12:
                System.out.println("qis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("payiz");
                break;
            default:
                System.out.println("Yanlis");
                break;


        }

    }
}
