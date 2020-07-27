import java.util.Arrays;

public class task63 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        swap(array, 0, 1);

        int[] array2 = new int[]{2, 3, 4, 5, 6, 10};
        swap(array2, 2, 5);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);

        // todo...

        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}
    String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
//Выводим изначальный массив в консоль
		for (int i=0; i<a.length; i++){
        System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
        temp = a[n-i-1];
        a[n-i-1] = a[i];
        a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
        System.out.print(a[i]);
        }
        }
        }