import java.util.Scanner;

public class Zadacha102 {
    public static void main(String[] args) {
        System.out.println("Ввести двузначное натуральное число. Вывести на экран количество десятков в нем.");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите двузначное натуральное число");
        int x=in.nextInt();
        int y=x/10;
        System.out.println("Количество десятков "+"= "+y);
    }
}