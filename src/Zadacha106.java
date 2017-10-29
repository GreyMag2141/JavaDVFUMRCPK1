import java.util.Scanner;

public class Zadacha106 {
    public static void main(String[] args) {
        System.out.println("Программа вычисляет указанную степень этого числа.");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите число, степень:");
        int a = in.nextInt(), b = in.nextInt();
        double x = Math.pow(a,b);
        System.out.println("Равно "+"= "+x);
    }
}