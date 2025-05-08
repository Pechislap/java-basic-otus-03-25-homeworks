package ru.otus.java.basic.homeworks.homework10;

public class Box {
    private int size;
    private String color;
    private boolean closed;
    private boolean empty;
    private String thing;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int size, String colour) {
        this.size = size;
        this.color = colour;
        this.closed = true;
        this.thing = null;

    }

    public void info() {
        System.out.println("Размер: " + size);
        System.out.println("Цвет: " + color);
        System.out.println();
    }

    public void open() {
        closed = false;
        System.out.println("Коробка открыта");
    }

    public void close() {
        closed = true;
        System.out.println("Коробка закрыта");
    }

    public void putThing(String thing) {
        if (closed == true) {
            System.out.println("Коробка закрыта, откройте коробку что-бы положить вещь");
            return;
        }
        if (this.thing != null) {
            System.out.println("Освободите коробку, что-бы положить " + thing);
            return;
        }
        this.thing = thing;
        System.out.println(thing + " в коробке");
    }

    public void removeThing(String removeThing) {
        if (closed == true) {
            System.out.println("Коробка закрыта, откройте коробку что-бы вытащить вещь");
            return;
        }
        if (this.thing == null) {
            System.out.println("Из коробки нечего вытаскивать");
            return;
        }
        if (removeThing != this.thing){
            System.out.println(removeThing + " нет в коробке");
            return;
        }
        if (this.thing == removeThing) {
            System.out.println(thing + " вынута из коробки");
            return;
        }
        this.thing = null;
    }
}



