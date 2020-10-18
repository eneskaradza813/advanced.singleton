package advanced;

import java.util.ArrayList;
import java.util.List;

public class PairUser {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new OrderPair<>(1, "Kanita");
        System.out.println(pair1.getKey() + pair1.getValue());
        
        List<String> prvaKlupa = new ArrayList<>();
        prvaKlupa.add("Mahir");
        prvaKlupa.add("Ferida");
        prvaKlupa.add("Kanita");
        
        Pair<Integer, List<String>> pair2= new OrderPair<>(1, prvaKlupa);
        
        Pair<Integer, String> pair3 = new OrderPair<>(1, "Ferida");
        
        boolean result = Util.<Integer, String>comparePair(pair1, pair3);
        System.out.println(result);
    }
    
}
