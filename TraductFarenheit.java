import java.util.Scanner;
public class TraductFarenheit {
    public static void main(String[] args) {
        long Farenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el valor Farenheit: ");
        Farenheit = sc.nextLong();

        System.out.print((Farenheit - 32) / 1.8);
    }
}
