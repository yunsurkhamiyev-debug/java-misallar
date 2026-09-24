package misallar;
import java.util.Scanner;

public class misal09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bal=scanner.nextInt();
        int onluq=bal/10;
        char herf;
        switch (onluq) {
            case 10:
            case 9:
                herf='A';
                break;
            case 8:
                herf='B';
                break;
            case 7:
                herf='C';
                break;
            case 6:
                herf='D';
                break;
            default:
                herf='F';
                break;
        }
        System.out.println(herf);


    }
}
