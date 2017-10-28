import java.util.Scanner;

public class Zadacha101 {
    public static void main(String[] args) {
    System.out.println("Ввести с клавиатуры натуральное число. Вывести на экран младший разряд числа.");
    Scanner in= new Scanner(System.in);
    System.out.println("Введите натуральное число");
    int x=in.nextInt();
    int y=x%10;
    System.out.println("Младший разряд числа"+"="+y);
    }
}
