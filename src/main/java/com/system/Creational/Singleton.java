package com.system.Creational;

public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(INSTANCE==null){
            synchronized (Singleton.class){
                if (INSTANCE == null) {
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException ie){
                        System.out.println("Exception occured"+ ie.getMessage());
                    }
                    INSTANCE=new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
