package org.example.task1;

class Main<T> {
    T ob;

    Main(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
    }
}