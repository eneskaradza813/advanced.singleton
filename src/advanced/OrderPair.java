package advanced;

public class OrderPair<K, V> implements Pair<K, V>{

    private K key;
    private V value;
    
    public OrderPair(K kljuc, V vrijednost){
        this.key = kljuc;
        this.value = vrijednost;
    }
    
    @Override
    public K getKey() {
        
        return key;
    }

    @Override
    public V getValue() {
        return value;
         }

    
}
