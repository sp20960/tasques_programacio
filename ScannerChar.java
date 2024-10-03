import java.util.Scanner;
public class ScannerChar {
    public static void main(String[] args) {
        String Frase;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Frase: ");
        Frase = sc.nextLine();
        Frase = Frase.toUpperCase();
        System.out.println(Frase);

    }
}
