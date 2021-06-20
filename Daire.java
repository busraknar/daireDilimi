import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double yariCap,merkez,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        yariCap = input.nextDouble();
        System.out.println("Merkez açısının ölçüsünü giriniz:");
        merkez = input.nextDouble();
        alan=(3.14*(yariCap*yariCap) * merkez)/360;
        System.out.println("Daire diliminin Alanı="+alan );
    }
}
