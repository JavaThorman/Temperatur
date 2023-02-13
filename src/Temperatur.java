import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int grader;

        System.out.println("Ange hur många grader det är:");
        grader = input.nextInt();

        if (grader > 50) {

            System.out.println("Aggh jag brinner upp!");

        } else if (grader >= 40) {
            System.out.println("Ofattbart varmt");

        } else if (grader >= 30) {
            System.out.println("As varmt");

        } else if (grader >= 27) {
            System.out.println("Varmt");

        } else if (grader >= 20) {
            System.out.println("Ljummet");

        } else if (grader >= 10) {
            System.out.println("Lätt Kyligt");

        } else if (grader >= 0) {
            System.out.println("Kyligt");

        } else if (grader >= -10) {
            System.out.println("Kallt");

        } else if (grader >= -20) {
            System.out.println("Askallt");

        } else if (grader >= -30) {
            System.out.println("Vansinnigt Kallt");

        } else if (grader >= -50) {
            System.out.println("Aggh jag fryser ihjäl");
        }
    }
}
