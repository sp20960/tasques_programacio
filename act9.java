import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.println("Introdueix una frase: ");
        frase = sc.nextLine();
        sc.close();
        System.out.println("El darrer caracter es: " + frase.charAt(frase.length()-1));
    }
}
