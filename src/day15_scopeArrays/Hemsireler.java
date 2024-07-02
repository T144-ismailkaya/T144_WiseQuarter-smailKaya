package day15_scopeArrays;

public class Hemsireler {
    public static void main(String[] args) {


        Hastane getPersonelHemsireire = new Hastane();
        Hastane personelHemsire1 = new Hastane();
        Hastane personelHemsire2 = new Hastane();

        personelHemsire1.personelIsmi = "Münevver Kaya";
        personelHemsire1.personelAdresi = "Gürpınar";
        personelHemsire1.personelAge = 40;
        personelHemsire1.personelGorevi = "Baş Hemşire";

        personelHemsire2.personelIsmi = "Beyzanur Kaya";
        personelHemsire2.personelAdresi = "Beykoz";
        personelHemsire2.personelAge = 3;
        personelHemsire2.personelGorevi = "Danışman";

        System.out.println("----------Kaya-Hastanesi----------");
        System.out.println();
        System.out.println("----------Personel-1----------");

        System.out.println(personelHemsire1.personelIsmi);
        System.out.println(personelHemsire1.personelAdresi);
        System.out.println(personelHemsire1.personelAge);
        System.out.println(personelHemsire1.personelGorevi);
        System.out.println("----------Personel-2----------");

        System.out.println(personelHemsire2.personelIsmi);
        System.out.println(personelHemsire2.personelAdresi);
        System.out.println(personelHemsire2.personelAge);
        System.out.println(personelHemsire2.personelGorevi);


    }

}
