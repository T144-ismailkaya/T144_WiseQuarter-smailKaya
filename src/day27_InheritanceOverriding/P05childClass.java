package day27_InheritanceOverriding;

public class P05childClass extends P04_parentClass {
    String isim = "Child İsim";
    String telefon = "Child telefon";
    String adres = "Child adress";
    int yas = 60;
    int kilo = 154;

    public void method1() {
        System.out.println("Child Method - 1");
    }

    public void method2() {
        System.out.println("Child Method - 2");
    }

    public void method4() {
        String adres = "Method Adress";
        int yas = 40;
        System.out.println(yas); // 40 [scope]
        System.out.println(this.yas); // 60 [class instance]
        System.out.println(super.yas); // 44 [parent]

        System.out.println(adres); //Method Adress
        System.out.println(this.adres); //Child adres
        // System.out.println(super.adres); //CTE
        method1(); //Child Method - 1
        this.method1(); //Child Method - 1
        super.method1(); //Parent Method - 1
        this.method2(); //Parent Method - 2
        super.method2(); //Parent Method - 2
        //super.method3(); CTE
    }

         /*
            Javada herhangi bir scaope'ta
            bir variable ya da method kullanmak isterseniz
            java aşağıdaki sıra ile mariable/method'u arar
            1-İçinde olunan scope
            2-İçinde olunan class (this)
            3-Extends edilen parent (super)
         */

    public static void main(String[] args) {
        P05childClass obj = new P05childClass();
        obj.method4();


    }
}
