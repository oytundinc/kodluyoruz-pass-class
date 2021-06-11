import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double gradeAverage;

        Scanner input = new Scanner(System.in);

        System.out.print("Math notunuz : ");
        double math = input.nextInt();
        if (0 > math || 100 < math) {
            math = 0;
        }

        System.out.print("Physics notunuz : ");
        double physics = input.nextInt();
        if (0 > physics || 100 < physics) {
            physics = 0;
        }

        System.out.print("Turkish notunuz : ");
        double turkish = input.nextInt();
        if (0 > turkish || 100 < turkish) {
            turkish = 0;
        }

        System.out.print("History notunuz : ");
        double history = input.nextInt();
        if (0 > history || 100 < history) {
            history = 0;
        }

        System.out.print("Music notunuz : ");
        double music = input.nextInt();
        if (0 > music || 100 < music) {
            music = 0;
        }

        gradeAverage = (math + physics + turkish + history + music) / 5;

        if (gradeAverage <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }
        System.out.println("Ortalamanız : " + gradeAverage);

    }
}
