package Singleton;

public class SingleObject {

    private static SingleObject singleObjectInstance;

    private SingleObject() {
        System.out.println("Constructing single object instance");
    }

    public static  SingleObject getInstance(){
        if(singleObjectInstance==null){
        synchronized (SingleObject.class){
            if(singleObjectInstance==null){
                singleObjectInstance = new SingleObject();
            }
        }
        }

        return singleObjectInstance;
    }
}