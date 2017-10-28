import java.util.Scanner;

public class Zadacha102 {
    public static void main(String[] args) {
        System.out.println("двузначное натуральное число.");
        Scanner in= new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int x=in.nextInt();
        int y=x/10;
        System.out.println("количество десятков в нем"+"="+y);
    }
}