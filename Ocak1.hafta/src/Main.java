import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1️-) Java, platformdan bağımsız çalışan nesne yönelimli bir programlama dilidir. Web uygulamaları, Android uygulamaları ve kurumsal yazılımlar gibi birçok alanda kullanılır.

        // 2️-) Java'nın bileşenleri:
        //    - JDK: Java uygulamaları geliştirmek için gerekli araçları içerir.
        //    - JRE: Java uygulamalarının çalışması için gerekli ortamı sağlar.
        //    - JVM: Java bytecode'unu çalıştıran sanal makinedir.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");

        String ad = scanner.nextLine();

        System.out.println("Merhaba, " + ad + "!");
    }