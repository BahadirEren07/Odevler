import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1️-) Koşullu ifadeler (if-else) ne işe yarar?
        //     - Koşullu ifadeler, belirli bir durumun gerçekleşip gerçekleşmediğini kontrol eder.
        //       Eğer koşul sağlanıyorsa bir işlem yapılır, sağlanmıyorsa başka bir işlem yapılır.
        //     - Gerçek hayattan örnek: Eğer hava yağmurluysa şemsiye al, değilse şemsiye alma.

        // 2️-) Girilen bir sayının tek mi çift mi olduğunu bulan Java programı:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();


        if (sayi % 2 == 0) {
            System.out.println("Sayı çift.");
        } else {
            System.out.println("Sayı tek.");
        }

        // 3️-) Bir sayının pozitif, negatif veya sıfır olup olmadığını belirleyen program:
        System.out.print("Bir sayı girin: ");
        int sayi2 = scanner.nextInt();


        if (sayi2 > 0) {
            System.out.println("Sayı pozitif.");
        } else if (sayi2 < 0) {
            System.out.println("Sayı negatif.");
        } else {
            System.out.println("Sayı sıfır.");
        }


    }
}
