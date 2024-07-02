package day20_StaticBlocksMutableImmutable;

public class P02_statickOlmayanBlocks {

    /*
    Obje oluşturmadan önce
    bazı ayarların yapılması gerekiyorsa
    ya da bazı veraiable'lara database'den değer atanması gerekiyorsa
    bu işlemler static olmayan bloklar yarımıyla yapılır
    obje oluşturulmadan önce static olmayan bloklar çalışır
     */

    P02_statickOlmayanBlocks() {
        System.out.println("Parametresiz constructor çalıştı");
        method2();
    }


    {
        System.out.println("Static olmayan block çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");
        method1();
        P02_statickOlmayanBlocks obj = new P02_statickOlmayanBlocks();
    }

    static {
        System.out.println("Static method çalıştı");
    }

    public static void method1() {
        System.out.println("Method-1 çalıştı");
    }

    public void method2() {
        System.out.println("Method-2 çalıştı");
    }

}
