public class ArrayABC {
    public static void main(String[] args) {
        int [] taulaA = {1,5,7,2,7};
        int [] taulaB = {3,7,34,2,4};
        int [] taulaC = {taulaA[0] + taulaB[0], taulaA[1] + taulaB[1], taulaA[2] + taulaB[2], taulaA[3] + taulaB[3], taulaA[4] + taulaB[4]};
        System.out.println(taulaC[0]);
        System.out.println(taulaC[1]);
        System.out.println(taulaC[2]);
        System.out.println(taulaC[3]);
        System.out.println(taulaC[4]);
    }
}
