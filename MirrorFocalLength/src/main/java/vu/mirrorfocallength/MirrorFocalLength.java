package vu.mirrorfocallength;
import java.util.Scanner;
public class MirrorFocalLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input object and image distances
        System.out.print("Enter object distance u (cm, positive value): ");
        double u = -scanner.nextDouble(); // Makes u negative for concave mirror
        System.out.print("Enter image distance v (cm): ");
        double v = scanner.nextDouble();

        // Calculate focal length
        double fInverse = (1.0 / u) + (1.0 / v);
        double f = 1.0 / fInverse;

        // Display focal length
        System.out.printf("Focal length f = %.2f cm%n", f);

        // Check if mirror is acceptable
        if (f >= 9.0 && f <= 11.0) {
            System.out.println("Mirror is acceptable (focal length between 9.0 cm and 11.0 cm).");
        } else {
            System.out.println("Mirror is NOT acceptable (focal length outside 9.0 cm and 11.0 cm).");
        }
        scanner.close();
    }
}

