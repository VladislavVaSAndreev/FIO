package org.example;

public class DateException extends Exception{
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: неверный формат даты");
        System.out.printf("Это неправильный формат даты: %s", i);
        System.out.println();
    }
}
