import java.util.Scanner;
public class CalculNextChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char caracter = sc.next().charAt(0);
        char siguientecaracter = (char) (caracter + 1);
        System.out.println(siguientecaracter);
    }
}
