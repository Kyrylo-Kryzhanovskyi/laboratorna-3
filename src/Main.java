import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        secondTask();

    }
    private static void secondTask() {
        System.out.println("Завдання 2");
        System.out.println("Ви створюєте двохвимірний масив з довільною довжиною рядків:");
        System.out.println("Введіть кількість рядків:");
        int row = in.nextInt();
        int [] [] arr = new  int [row][];
        System.out.println("Тепер для кожного рядка, визначимо кількість елементів, заповнення відбуватиметься випадково");
        for(int i=0;i<row;i++){
            System.out.printf("Введіть кількість елементів у рядку за індексом %d: " , i);
            int col = in.nextInt();
            arr[i] = new int[col];
            for(int j=0;j<col;j++){
                arr[i][j] = (int) ( Math.random()*20 - 10); // [-10, 10]
            }
        }
        System.out.println("Створена матриця: ");
        for (int[] i: arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Сортування.....");
        for (int[] i: arr){
            Arrays.sort(i);
        }
        System.out.println("Відсортований матриця: ");
        for (int[] i: arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Вивід матриці з від'ємними числами: ");
        for (int[] i: arr){
            System.out.print("[");
            for (int j: i){
                if(j>=0){
                    break;
                }
                System.out.print(j + ", ");
            }
            System.out.print("]\n");
        }
    }

    static void firstTask(){
        //1. За допомогою статичного методу реалізувати бульбашкове сортування масиву
        //цілих чисел (довжина масиву задається при виклику методу сортування).
        System.out.println("Завдання 1");
        System.out.println("Введіть розмір масиву для сортування:");
        int length = in.nextInt();
        int [] arr = new int[length];
        for(int i=0;i<length;i++){
            System.out.printf("Введіть елемент за індексом %d: " , i);
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