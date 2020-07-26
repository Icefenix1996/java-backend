import java.util.Scanner;

public class task57 {
    public static void main(String[] args) {
        System.out.println("Enter the day of the week.");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toLowerCase(); // it can be any day

        switch(day) {
            case "monday":
                System.out.println("This is the first day of the week");
            case "tuesday":
                System.out.println("This is the second day of the week");
            case "wednesday":
                System.out.println("This is the third day of the week");
            case "thursday":
                System.out.println("This is the fourth day of the week");
            case "friday":
                System.out.println("This is the fifth day of the week");
            case "saturday":
                System.out.println("This is the sixth day of the week");
            case "sunday":
                System.out.println("This is the seventh day of the week");
            default:
                System.out.println("Such day of the week doesn't exist.");
        }
    }
}
