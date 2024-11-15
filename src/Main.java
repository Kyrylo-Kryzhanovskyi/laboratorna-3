
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введіть номер завдання (1-5) або 0 для виходу: ");
            int taskNumber;

            if ((taskNumber = in.nextInt()) == 0) {
                System.out.println("Вихід з програми.");
                break;
            }

            switch (taskNumber) {
                case 1:
                    firstTask();
                    break;
                case 2:
                    secondTask();
                    break;
                case 3,4:
                    thirdAndFourthTask();
                    break;
                case 5:
                    fifthTask();
                    break;
                default:
                    System.out.println("Некоректний номер завдання. Введіть число від 1 до 5.");
            }
        }
    }
    private static void fifthTask(){
        // Створення звичайного легкового автомобіля
        PassengerCar regularCar = new PassengerCar(
                "Toyota",
                "Camry",
                2022,
                "White",
                2.5f,
                "Sedan",
                5
        );

        System.out.println("\n\t\tRegular Passenger Car");
        System.out.println(regularCar.getInfo());
        System.out.println(regularCar.checkStatus());

        regularCar.setColor("Black");
        regularCar.setYearOfRelease(2023);
        regularCar.setEngineVolume(3.0f);

        System.out.println("\n\t\tAfter using setters");
        System.out.println(regularCar.getInfo());

        System.out.println("\t\tAdding Air Conditioner:" + regularCar.addAirConditioner());
        System.out.println("\t\tAdding Heated Seats:" + regularCar.setHeatedSeat());
        System.out.println("\t\tAdding Multimedia:" + regularCar.addMultimedia());

        System.out.println("\n\t\tAfter adding comfort features");
        System.out.println(regularCar.getInfo());
        System.out.println(regularCar.checkStatus());
        System.out.println("\tHas Air Conditioner: " + regularCar.isHaveAirConditioner());
        System.out.println("\tHas Heated Seats: " + regularCar.isHaveHeatedSeat());
        System.out.println("\tHas Multimedia: " + regularCar.isHaveMultimedia());

        PassengerCar electricCar = new PassengerCar(
                "Tesla",
                "Model 3",
                2023,
                "Red",
                0.0f, // Електричний автомобіль не має об'єму двигуна
                "Sedan",
                5,
                90.0f,
                500
        );

        // Перевірка інформації про електричний автомобіль
        System.out.println("\n\t\tElectric Passenger Car");
        System.out.println(electricCar.getInfo());
        System.out.println(electricCar.checkStatus());

        electricCar.setChargeLevel(80.0f);
        electricCar.setPowerReserve(450);

        System.out.println("\n\t\tAfter using setters on Electric Car");
        System.out.println(electricCar.getInfo());
        System.out.println(electricCar.checkStatus());

        Truck truck = new Truck(
                "Volvo",
                "FH16",
                2020,
                "Blue",
                16.0f,
                20000,
                "Bulk",
                3
        );

        System.out.println("\n\t\tTruck");
        System.out.println(truck.getInfo());
        System.out.println(truck.checkStatus());

        truck.setLoadCapacity(25000);
        truck.setLoadType("Liquid");
        truck.setNumberOfAxes(4);

        System.out.println("\n\t\tAfter using setters on Truck");
        System.out.println(truck.getInfo());
        System.out.println(truck.checkStatus());
    }
    private static void thirdAndFourthTask(){
//3. Створити свій клас з полями доступу public і private, перевірити їх доступність з
//іншого класу поточного пакета.
//4. Зробити клас із перевантаженими конструкторами (за умовчанням, із заданими
//параметрами, створення копії іншого об&#39;єкта).
        System.out.println("Третє та четверте завдання:");
        ThirdAndFourthTask task1 = new ThirdAndFourthTask();
        System.out.printf("Параметри об'єкту(ThirdAndFourthTask task1 = new ThirdAndFourthTask();) за замовченням: публічне поле = %d та приватне поле = %d \n",task1.publicField, task1.getPrivateField());
        ThirdAndFourthTask task2 = new ThirdAndFourthTask(111, 232);
        System.out.printf("Параметри об'єкту(ThirdAndFourthTask task2 = new ThirdAndFourthTask(111, 232);) із заданими параметрами: публічне поле = %d та приватне поле = %d \n",task2.publicField, task2.getPrivateField());
        ThirdAndFourthTask task3 = new ThirdAndFourthTask(task2);
        System.out.printf("Параметри об'єкту(ThirdAndFourthTask task3 = new ThirdAndFourthTask(task2);) створення копії: публічне поле = %d та приватне поле = %d \n",task3.publicField, task3.getPrivateField());
        // Як можна побачити вище для того, щоб отримати доступ до приватного поля, потрібно використовувати getter та setter
        // До публічного поля ми маємо доступ напряму.
    }
    private static void secondTask() {
//2. Задана &quot;нерівна матриця&quot; (або ступінчастий масив - двовимірний масив, рядки в
//якому мають різну довжину: int [] [] arr; arr = new int [5] []; arr [0] = new int [3]; arr
//[1] = new int [7]; і т.д.). Матриця містить цілі значення. Відсортувати кожен рядок
//(використовувати Arrays.sort() ), надрукувати матрицю на екрані. Повторно
//роздрукувати матрицю, але виводити на екран лише негативні значення
//(використовувати цикл із break).
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
        System.out.println("Відсортована матриця: ");
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