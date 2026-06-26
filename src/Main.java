import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите размер массива: ");
        int masSize = scanner.nextInt();
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





    }
}