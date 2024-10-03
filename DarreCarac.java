import java.util.Scanner;
public class DarreCarac {
    public static void main(String[] args) {
        String cadena;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma cadena: ");
        cadena = sc.nextLine();
        int lenght = cadena.length();
        char UltimoCaracter = cadena.charAt(lenght - 1);
        System.out.println(UltimoCaracter);

    }
}
