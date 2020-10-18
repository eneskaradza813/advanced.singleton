package advanced.seven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMultiThreadingBreak {

    
    public static void main(String[] args) {
        iskoristiSingleton();
        new Thread(new InnerClassRunnable()).start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                iskoristiSingleton();
            }
        };
       // new Thread(runnable).start();
      //  Runnable runnable1 = () -> iskoristiSingleton();
        //new Thread(runnable1).start();
      //  Runnable runnable2 = SingletonMultiThreadingBreak::iskoristiSingleton;
       // new Thread(runnable2).start();
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> iskoristiSingleton());
        executorService.submit(SingletonMultiThreadingBreak::iskoristiSingleton);
        executorService.submit(SingletonMultiThreadingBreak::iskoristiSingleton);
        executorService.submit(SingletonMultiThreadingBreak::iskoristiSingleton);
    }
    static void iskoristiSingleton(){
        System.out.println(Thread.currentThread().getName());
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        
        SingletonLazy nasFadil = SingletonLazy.getInstance();
        printer.print("Nas Fadil", nasFadil);
    }
    static class InnerClassRunnable implements Runnable{

        @Override
        public void run() {
            iskoristiSingleton();
        }
        
    }
}
