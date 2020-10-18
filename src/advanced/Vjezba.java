package advanced;

import java.util.ArrayList;
import java.util.List;

public class Vjezba {

    public static void main(String[] args) {

        List lista = new ArrayList();
        lista.add("Ammar");
        String prviElement =(String) lista.get(0);
        
        List<String> lista1 = new ArrayList<String>();
        lista.add("Amar");
        String prviElement1 = lista1.get(0);
        
        Box kutija = new Box();
        kutija.setObject("Enes");
        String vrijednostEnesoveKutije =(String) kutija.getObject();
        
        Box feridinaKutija = new Box();
        feridinaKutija.setObject(new Integer(23));
        Integer vrijednostFeridineKutie = (Integer)feridinaKutija.getObject();
        
        Box<String> fadilovaKutija = new Box<String>();
        fadilovaKutija.setObject("Fadil");
        String vrijednostFadiloveKutije = fadilovaKutija.getObject();
        
        Box<Double> mahirovaKutija = new Box<>();
        mahirovaKutija.setObject(0.4);
        Double sadrzaj = mahirovaKutija.getObject();
        
    }

}
