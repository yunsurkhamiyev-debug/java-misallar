package misallar;
import java.util.Scanner;

public class misal10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("BAzar ertesi");
                break;
            case 2:
                System.out.println("CArsanba axsami");
                break;
            case 3:
                System.out.println("carsanba");
                break;
            case 4:
                System.out.println("cume axsami");
                break;
            case 5:
                System.out.println("cume");
                break;
            case 6:
                System.out.println("senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("YAnlis");


        }


    }
}
