public class IntercanviValors {
    public static void main(String[] args) {

        int numA = 58;
        int numB = 7;
        Object temp;

        temp = numA;
        numA = numB;
        numB = (int) temp;
        System.out.println(numA);
        System.out.println(numB);

    }
}
