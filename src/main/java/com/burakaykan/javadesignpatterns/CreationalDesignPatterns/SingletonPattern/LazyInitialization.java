package com.burakaykan.javadesignpatterns.CreationalDesignPatterns.SingletonPattern;

public class LazyInitialization {

    private static LazyInitialization instace;

    public LazyInitialization() { }

    public static LazyInitialization getInstace() {
        if (instace == null) {
        instace = new LazyInitialization();
        }
        return instace;
    }
}
