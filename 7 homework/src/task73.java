import java.util.Arrays;

public class task73 {

        public static void main(String[] args) {

            int[] myArray = {10, 20, 15, 17, 24, 35};
            int mul=1;
            for(int i=0; i<myArray.length; i++) {
                mul=mul*myArray[i];
            }
            System.out.println(mul);
        }}