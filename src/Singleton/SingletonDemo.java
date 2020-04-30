package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {




        Thread thread1 = new Thread(new Runnable() {
            public void run(){
                SingleObject singleObject1 = SingleObject.getInstance();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run(){
                SingleObject singleObject2 = SingleObject.getInstance();
            }
        });
        thread1.start();
        thread2.start();

    }
}
