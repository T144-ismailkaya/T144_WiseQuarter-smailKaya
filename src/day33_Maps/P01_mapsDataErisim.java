package day33_Maps;

import java.util.Map;

public class P01_mapsDataErisim {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        //System.out.println(ogrenciMap);

        //ÖĞRENCİ NUMARASINI GİREREK ÖĞRENCİNİNADINI VE SOYADINI AŞAĞIDAKİ FORMATTA YAZDIRIN
        // Mustafa İsmail

        System.out.println(MapDepo.numaraylaBilgiGetirme(ogrenciMap, 103));
        System.out.println(MapDepo.numaraylaBilgiGetirme(ogrenciMap, 105));

        MapDepo.sinifListesiYazdir(ogrenciMap, 11);
    }
}
