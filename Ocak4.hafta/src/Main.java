import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1️-) Döngüler (for, while) ne işe yarar? Kullanım alanlarını açıklayın:
        //     - Döngüler, belirli bir koşul sağlandığı sürece aynı işlemi tekrar tekrar yapmamıza olanak tanır.
        //     - **for** döngüsü, genellikle belirli bir sayıda tekrarlanacak işlemler için kullanılır.
        //     - **while** döngüsü, koşul sağlandığı sürece çalışır ve genellikle koşulun dinamik olarak değişeceği durumlar için uygundur.
        //     - Kullanım alanları: Veri üzerinde işlem yapma, belirli bir aralıktaki sayılarla işlem yapma, belirli bir sayıda tekrarlanan görevleri otomatikleştirme.


        System.out.println("1'den 10'a kadar olan sayılar:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;


        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + " kadar olan sayıların toplamı: " + toplam);


    }
}
