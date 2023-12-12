package org.example;

public class SexException extends Exception{
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: Неверные данные о поле");
        System.out.printf("Это неверные данные: %s", i);
        System.out.println();
    }
}
