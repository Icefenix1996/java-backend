import java.util.Scanner;

public class task56 {
    public static void main(String[] args) {
        System.out.println("Enter any season 1-4.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case  1:
                System.out.println("wbynth");
                break;
            case 2 :
                System.out.println("vesna");
                break;
            case 3:
                System.out.println("leto");
                break;
            case 4:
                System.out.println("osen");
                break;
            default:
                System.out.println("drugoe chislo");
                break;
        }
    }
}
