package misallar;
import java.util.Scanner;

public class misal12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("toplama");
                break;
            case 2:
                System.out.println("cixma");
                break;
            case 3:
                System.out.println("vurma");
                break;
            case 4:
                System.out.println("bolme");
                break;
            default:
                System.out.println("Yanlis secim");
                break;

        }

    }
}
