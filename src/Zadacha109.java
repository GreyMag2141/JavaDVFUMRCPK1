import java.util.Scanner;

public class Zadacha109 {
    public static void main(String[] args) {
        System.out.println("Программа переводит километры в сухопутные и морские мили. ");
        Scanner in= new Scanner(System.in);
        System.out.print("Введите количество: ");
        double x =in.nextDouble();
        double s = x*0.6213711922373341; // в чем подвох
        System.out.println("Cухопутные мили: " + s);
        double m = x*0.5399568034557236;
        System.out.println("Морские мили: " + m);
    }
}