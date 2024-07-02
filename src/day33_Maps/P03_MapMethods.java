package day33_Maps;

import java.util.Map;

public class P03_MapMethods {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.mapOlustur();
        System.out.println(ogrenciMap);
        /*
{101=Mustafa-İsmail-11-A-SAY,
 102=102=Murat-Yiğit-11-K-EA,
  103=Serpil-Cem-11-A-SÖZ,
   104=Neslihan-Koç-11-A-SAY,
    105=Levent-Seflek-11-K-EA,
     106=Can-Yılmaz-11-A-SAY,
      107=Berk-Babayiğit-10-C-SÖZ,
       108=Rana-Ülker-12-A-EA,
        109=İsmail-Kaya-Mezun-D-EA}

         */
        /*
        put metodu yoksa ekler varsa siler yeni yazılarını ekler
         */

        ogrenciMap.put(110,"Sena-Yiğit-9-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-K-EA");
        System.out.println(ogrenciMap);

        // replace value'deki değerleri toplu yadad bireysel olarak değiştirir
        //fakat yeni değerleri gönderirken değişmeyenler de değişenlebirlikte tek string olarak döner
        ogrenciMap.replace(107,"Berk-Babayiğit-10-C-SÖZ","Berk-Babayiğit-10-C-EA");
        System.out.println(ogrenciMap);

        ogrenciMap.get(103);
        //getOrDefault key varsa yazar yoksa mesajı yazar
        ogrenciMap.getOrDefault(120,"Böyle bir numaraya sahip öğrenci yoktur...");

        System.out.println(ogrenciMap.putIfAbsent(120, "Murat-Yiğit-11-K-SAY"));
    }

}
