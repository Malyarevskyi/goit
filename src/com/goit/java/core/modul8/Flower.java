package core.modul8;

public class Flower {

    private String name;
    private String colour;
    private int quantity;
    private int size;

    public Flower(String name, String colour, int quantity, int size) {
        this.name = name;
        this.colour = colour;
        this.quantity = quantity;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name + " " + colour + " " + quantity + " " + size;
    }
}