import java.util.Scanner;

/**
 * Lingkaran05
 */
public class Lingkaran05 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int r;
        double keliling, luas;
        double phi = 3.14; //Variabel Phi

        System.out.println("Masukkan jari-jari lingkaran");
        r=input.nextInt();

        keliling=2 * phi * r;
        luas= phi*r*r;

        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("Luas Lingkaran: " + luas);
    }
}