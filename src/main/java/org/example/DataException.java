package org.example;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: Неверный формат данных");
        System.out.printf("Это неправильный формат: %s", i);
        System.out.println();
    }
}
