import java.util.Scanner;

public class task72 {
    public static void main(String[] args){


      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите число");
       int a = scanner.nextInt();
       int i = 1;
       int x = i * i;

       while (x <= a) {
          System.out.println(x);
           i++;
           x = i*i;
       }}}



