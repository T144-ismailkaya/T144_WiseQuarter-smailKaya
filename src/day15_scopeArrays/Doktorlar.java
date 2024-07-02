package day15_scopeArrays;

public class Doktorlar {

    public static void main(String[] args) {
        Hastane personel1 = new Hastane();
        Hastane personel2 = new Hastane();
        Hastane personel3 = new Hastane();
        Hastane personel4 = new Hastane();


        personel1.personelIsmi = "Mehmet Kaya";
        personel1.personelAdresi = "Bahçelievler";
        personel1.personelAge = 16;
        personel1.personelGorevi = "Başhekim";

        personel2.personelIsmi = "İsmail Kaya";
        personel2.personelAdresi = "Kavaklı";
        personel2.personelAge = 16;
        personel2.personelGorevi = "Kan alma";

        personel3.personelIsmi = "İbrahim Kaya";
        personel3.personelAdresi = "Avcılar";
        personel3.personelAge = 17;
        personel3.personelGorevi = "Ameliyat Yöneticisi";

        personel4.personelIsmi = "Yusuf Kaya";
        personel4.personelAdresi = "Büyükçekmece";
        personel4.personelAge = 12;
        personel4.personelGorevi = "Diş Teknisyeni";

        System.out.println("----------Kaya-Hastanesi----------");
        System.out.println();
        System.out.println("----------Personel-1----------");

        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelAdresi);
        System.out.println(personel1.personelAge);
        System.out.println(personel1.personelGorevi);
        System.out.println("----------Personel-2----------");

        System.out.println(personel2.personelIsmi);
        System.out.println(personel2.personelAdresi);
        System.out.println(personel2.personelAge);
        System.out.println(personel2.personelGorevi);
        System.out.println("----------Personel-3----------");

        System.out.println(personel3.personelIsmi);
        System.out.println(personel3.personelAdresi);
        System.out.println(personel3.personelAge);
        System.out.println(personel3.personelGorevi);
        System.out.println("----------Personel-4----------");

        System.out.println(personel4.personelIsmi);
        System.out.println(personel4.personelAdresi);
        System.out.println(personel4.personelAge);
        System.out.println(personel4.personelGorevi);



    }

}
