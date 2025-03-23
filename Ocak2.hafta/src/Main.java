import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1️-) Java'da kullanılan temel veri tipleri ve boyutları:
        //    - byte: 1 byte, -128 ile 127 arasında değer alır.
        //    - short: 2 byte, -32,768 ile 32,767 arasında değer alır.
        //    - int: 4 byte, -2,147,483,648 ile 2,147,483,647 arasında değer alır.
        //    - long: 8 byte, çok büyük sayılar için, -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasında.
        //    - float: 4 byte, yaklaşık ±3.40282347E+38F (6-7 basamağa kadar hassasiyet).
        //    - double: 8 byte, yaklaşık ±1.7976931348623157E+308 (15-16 basamağa kadar hassasiyet).
        //    - char: 2 byte, tek bir Unicode karakteri temsil eder.
        //    - boolean: 1 bit, true veya false değerini alır.



        // 2️-) Aşağıdaki kodun çıktısını tahmin edin:


        // Çıktı 13.5


        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Toplam: " + toplam);


    }
}
