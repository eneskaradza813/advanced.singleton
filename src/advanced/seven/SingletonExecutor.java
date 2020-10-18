package advanced.seven;

import java.lang.reflect.Constructor;

public class SingletonExecutor {

    public static void main(String[] args) throws Exception {
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        SingletonEager singleton1 = SingletonEager.getInstance();
        printer.print("Singleton1", singleton1);
        SingletonEager singleton2 = SingletonEager.getInstance();
        printer.print("Singleton2", singleton2);
        
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        printer.print("Singleton Lazy", singletonLazy1);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        printer.print("Singleton Lazy 2", singleton2);
    }
     class ObjectPrinter{
         public void print(String message, Object singleton){
             System.out.println(String.format("Ime objekta: %s, HashCode: %d", message, singleton.hashCode()));
    }
  }
}
