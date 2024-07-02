package day02_dataTurleriScanner;

public class P01_IntegersNelerdir {
    public static void main(String[] args) {

        byte sayi1=23; // hafızada 8 bit yer kaplar
        short sayi2=23; // hafızada 16 bit yer kaplar
        int sayi3=23; // hafızada 32 bit yer kaplar
        long sayi4=23; // hafızada 64 bit yer kaplar

        // Bu 4 terimi bir kova olarak düşünelim code yazarken doğru olan terimi kullanmak önemlidir
        // Eğer mesela bir data verisine yaş bilgisi vericekse byte kullanabiliriz
        // Ama int de kullanabiliriz buyuk kova kullanırsak hafızada daha büyük karmaşıklıklara yol açar

        // Ondalıklı sayılar bulunduran data türleri

        float sayi5=5.14f;
        float sayi6=7.47f;
        System.out.println(sayi5+sayi6);
        // float olndalıklı sayıları ifade edilirken kullanılır

        double sayi7=52.9132;
                double sayi=3;
        System.out.println(sayi7/sayi);
        // double v efloat arasındaki farklar şudur
        // float kullanırken float verdiğimiz değerinin sonunda "f" olmalı
        // double ise float'dan daha fazla basamak alabilir

        boolean DogruMu = 5>2;
        System.out.println(DogruMu); // true cevabı verdi
        // true = evet-başarılı
        //false = hayır-başarısız
        // bir kodun doğru olup olmmadığını "boolean" koduyla öğrene biliriz


        char karakter = 66; // Ascii karakter verir
        char karakter1 = '5';
        System.out.println(karakter);
        System.out.println(karakter1); // 5 şeklinde yazdı
        //char kodu yanlızca bir karakter almakta ve bu karakterler space %&/( gibi özel karakterler içerebilir
        // eğer char koduna birden fazla sayı girersek o sayıya eşit arcii karakterini verir
        // az önceki örnektede denediğim gig 66 karakteri B harfine denk geldi

        System.out.println("Data verisinin aldığı min. değer= "+Byte.MIN_VALUE);   // Data verisinin aldığı min. değeri gösterir
        System.out.println("Data verisinin aldığı max. değer= "+Byte.MAX_VALUE); // Data verisinin aldığı max. değeri gösterir

        String str1= "Java Candır"; //"String" komutu metinsel ifade için kullanılır
        System.out.println(str1); // Java candır kelimesinini doğru bir şekilde yazdı

        String str2="Have a Nice Day";
        System.out.println(str2); // Have a Nice Day komutunu doğru bir şekilde yazdı

        System.out.println(str2.toLowerCase()); // Hepsini küçük yazdı
        System.out.println(str2.toUpperCase());// Hepsini büyük yazdı
        System.out.println(str2);



    }

}
