package advanced;

public class Util {

    public static <S, U> boolean comparePair(Pair<S, U> pair1, Pair<S, U> pair2){
        return pair1.getKey().equals(pair2.getKey()) && pair1.equals(pair2.getValue());
    }
}
