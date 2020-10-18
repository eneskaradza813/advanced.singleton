package advanced.seven;

public class SingletonEager {

    private static SingletonEager FADIL = new SingletonEager();
    private SingletonEager(){
        if(FADIL != null){
            throw new RuntimeException("Jedan je Fadil");
        }
        System.out.println("Kreiranje Singleton objekta");
    }
    public static SingletonEager getInstance(){
        return FADIL;
    }
}
