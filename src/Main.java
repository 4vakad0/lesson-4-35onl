import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите размер массива: ");
        int masSize = scanner.nextInt();
        boolean flag = true;

        // Проверка на правильность ввода размера массива
//        while (flag == true) {
//            if (masSize % 2 != 0) {
//                System.out.println("Некоректно задан размер массива, Размер должен быть четным");
//                System.out.println("Введите резмер масиива повторно:");
//                masSize = scanner.nextInt();
//            }else {
//                flag = false;
//            }
//        }




        // Создаем массив
        int[] mas = new int[masSize];


        //Заполнение элементов массива вручную с консоли
//        System.out.println("Веедите значения массива ");
//        for (int i = 0; i < masSize; i++) {
//            System.out.println("Введите " + (i + 1) + " значение массива:");
//            mas[i] = scanner.nextInt();
//        }


        //Массив заполняется случайным образом числами от 0 до 100
        System.out.println("Массив заполняется случайным образом числами от 0 до 100");
        for (int i = 0; i < masSize; i++) {
            mas[i] = (int) (Math.random() * 100);// Меняя 100 можно увеличивать диапазон заполнения
        }


        // Вывод массива
        System.out.println("Массив:");
        for (int i = 0; i < masSize; i++) {
            System.out.print(mas[i] + " ");
        }

        // Перестановка элементов массива
        for  (int i =  0; i < masSize / 2; i++) {
            int temp = mas[i];
            mas[i] = mas[masSize - 1 - i];
            mas[masSize - 1 - i] = temp;
        }

        System.out.println("Массив после перестановки:");
        for (int i = 0; i < masSize; i++) {
            System.out.print(mas[i] + " ");
        }






    }
}