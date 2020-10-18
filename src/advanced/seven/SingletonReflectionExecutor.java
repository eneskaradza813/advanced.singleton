package advanced.seven;

import java.lang.reflect.Constructor;

public class SingletonReflectionExecutor {

    public static void main(String[] args) throws Exception {
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        
        
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        printer.print("Singleton Lazy", singletonLazy1);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        printer.print("Singleton Lazy 2", singletonLazy2);
        
        Class clazz = Class.forName("advanced.seven.SingletonLazy");
        Constructor<SingletonLazy> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy singletonLazyDuplikat = constructor.newInstance();
        printer.print("duplikat", singletonLazyDuplikat);
        
        System.out.println("");
        
        SingletonEager singleton1 = SingletonEager.getInstance();
        printer.print("Singleton1", singleton1);
        SingletonEager singleton2 = SingletonEager.getInstance();
        printer.print("Singleton2", singleton2);
        Class clazz1 = singleton1.getClass();
        Constructor<SingletonEager> constructorEager = clazz.getDeclaredConstructor();
        constructorEager.setAccessible(true);
        SingletonEager drugiToskic = constructorEager.newInstance();
        printer.print("drugi toskic", drugiToskic);
    }
}
