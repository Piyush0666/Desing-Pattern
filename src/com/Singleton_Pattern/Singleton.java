package com.Singleton_Pattern;

public class Singleton
{
    private static Singleton instance;
    private String data;
    private Singleton(String data){
        this.data = data;
    }
    public static Singleton getInstance(String data) {
        if (instance == null) { // limited synchronization to the rare
                                // case of constructing a new instance of this field.
            synchronized (Singleton.class) { //now every thread has to wait before returning it.
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
            return instance;
        }
}
