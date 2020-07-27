public class task62 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        int temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }}}