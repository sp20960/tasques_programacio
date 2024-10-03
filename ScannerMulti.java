import java.util.Scanner;
public class ScannerMulti {
    public static void main(String[] args) {
        int Num1;
        int Num2;
        int Num3;
        Scanner Nombres = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        Num1 = Nombres.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        Num2 = Nombres.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        Num3 = Nombres.nextInt();
        System.out.println("El resultado es: " + (Num1 * Num2 * Num3));
    }
}
