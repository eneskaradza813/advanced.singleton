package advanced.seven;

public class SingletonCloneExecutor {

    public static void main(String[] args) throws Exception{
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        
        SingletonLazy nasFadil = SingletonLazy.getInstance();
        printer.print("Nas Fadil", nasFadil);
        SingletonLazy drugiFadil = SingletonLazy.getInstance();
        printer.print("Nas Fadil 2..", drugiFadil);
        
        SingletonLazy kloniranFadil = (SingletonLazy)nasFadil.clone();
        printer.print("Nas Fadil", kloniranFadil);
    }
}
