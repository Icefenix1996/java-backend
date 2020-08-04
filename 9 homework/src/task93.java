import java.util.Scanner;

public class task93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println("Первое слово = " + str1);
        System.out.println("Второе слово = " + str2);
        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2, str2.length()));
        System.out.println(str3);
    }
}
