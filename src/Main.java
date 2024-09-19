import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        firstTask();

    }
    static void firstTask(){
        //1. За допомогою статичного методу реалізувати бульбашкове сортування масиву
        //цілих чисел (довжина масиву задається при виклику методу сортування).
        System.out.println("Завдання 1");
        System.out.println("Введіть розмір масиву для сортування:");
        int length = in.nextInt();
        int [] arr = new int[length];
        for(int i=0;i<length;i++){
            System.out.printf("Введіть елемент № %d: " , i);
            arr[i] = in.nextInt();
        }
        System.out.println("Заданий масив: " + Arrays.toString(arr));
        bubbleSort(arr, length); //
        System.out.println("Відсортований масив: " + Arrays.toString(arr));
    }
    static void bubbleSort(int [] arr, int length) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int j = 1; j < length; j++) {
                if ( arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
        }

    }
    
}