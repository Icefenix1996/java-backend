public class task76 {
    public static void main(String[] args) {
        int num = 12345618;
        boolean have = false;
        int[] array = new int[(int)Math.log10(num)+1];
        for(int i = 0; i < array.length; i++) {
            array[i] = num%10;
            num/=10;
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++)
                if(array[i] == array[j] && i != j) {
                    System.out.print(array[i] + " ");
                    have = true;
                }
        }
        if(!have) System.out.println("Повторяющихся цифр не обнаружено!");

    }

}
