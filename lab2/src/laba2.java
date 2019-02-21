
import java.util.Scanner;

// Іванов А.В. Кн-2-1 (Варіант 10)
public class laba2 {
    public static void main(String[] args) {
        System.out.println("Завдання №1");
        float a; //змінюємо тип данних з byte на float
        a = 215000 / 24;
        System.out.println("a= " + a);

        System.out.println(" ");
        System.out.println("Завдання №2");
        System.out.println("Введіть довжину масиву: ");
        Scanner scan = new Scanner(System.in);
        int dlina = scan.nextInt();
        int[] array = new int[dlina];
        for (int i = 0; i < dlina; i++) {
            System.out.println("Введіть " + i + "елемент");
            array[i] = scan.nextInt();
        }
        System.out.println("Отриманий масив: ");
        for (int i = 0; i < dlina; i++) {
            System.out.print(+array[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Введіть індекс елемента, що потрібно вивести:");
        int index = scan.nextInt();
        System.out.println("Елемент під " + index + " індексом є:  " + array[index]);

        System.out.println(" ");
        System.out.println("Завдання №3");
        System.out.println("Двовимірний масив: ");
        int Array[][] = {
                {1, -2, 3, -4},
                {5, -6, -7, 8}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(Array[i][j] + "    ");
            System.out.println();
        }
        System.out.println(" ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (Array[i][j] > 0){
                    System.out.println("Додатні елементи з двохвимірного масиву: ");
                    System.out.print(Array[i][j]+", ");
                System.out.println(" ");
                System.out.println("Індекс додатнього елемента:");
                System.out.println("i="+i +" "+"j="+ j);}
            }
        }
    }
}
