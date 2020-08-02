import java.util.Scanner;

public class task74 {

    public static void main(String[] args) {
        Scanner vv=new Scanner (System.in);
        int var;
        String s="";
        System.out.print("Enter the maximum width - ");
        var=vv.nextInt();
        for (int i=1, j=var; i<=2*var; i++) {
            if (i<=var){            //иду к вершине фигуры
                s=s+"*";
                System.out.println(s);


        }
        vv.close();}}}