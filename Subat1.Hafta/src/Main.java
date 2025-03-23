import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1️-) Dizi (Array) nedir? Java’da nasıl tanımlanır?
        //     - Dizi, aynı türdeki birden fazla değeri saklamak için kullanılan veri yapısıdır.
        //     - Java'da bir dizi tanımlamak için, veri türü belirtilir, ardından köşeli parantezler ve dizinin ismi gelir.
        //       Örnek: int[] dizi = new int[5];  (Bu, 5 elemanlı bir int dizisi oluşturur.)


        Scanner scanner = new Scanner(System.in);

        int[] dizi = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        /
        System.out.println("Dizi elemanları:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Eleman " + (i + 1) + ": " + dizi[i]);
        }


        int enBuyuk = dizi[0];

        for (int i = 1; i < 5; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }

        System.out.println("Dizideki en büyük sayı: " + enBuyuk);

        
    }
}
