package ru.otus.java.basic.homeworks.homework10;

public class Box {
    private final int width = 10;
    private final int height = 15;
    private final int length = 25;
    private String colour;
    private boolean closed;
    private boolean boxEmpty;
    private String thing;



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getThing1() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public Box(boolean closed, String thing) {
        this.colour = "Black";
        this.closed = closed;
        this.thing = thing;
    }

    public void Info() {
        System.out.println("Ширина " + width);
        System.out.println("Высота " + height);
        System.out.println("Длинна " + length);
        System.out.println("Цвет " + colour);
    }

    public void Closed() {
        if (this.closed == true) {
            System.out.println("Коробка закрыта, что бы положить предмет, откройте коробку");
        } else {
            System.out.println("Коробка открыта и пуста, положите предмет");
        }
    }

    public void putThing() {
        if (this.closed == false) {
            System.out.println(this.thing + " в коробке");
        }
    }

}
