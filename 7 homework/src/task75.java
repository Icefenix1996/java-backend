import java.util.Scanner;

public class task75 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи число");
            int a = scanner.nextInt();

            while (a != 0) {
                a = ++ a;
                System.out.println("Введи число");
                a = scanner.nextInt();
            }
            System.out.println(a);


        }}