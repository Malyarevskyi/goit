package core.modul8;

public class Rose extends Flower implements Comparable<Rose> {
    public Rose(String name, String colour, int quantity, int size ) {
        super(name ,colour, quantity,  size);
    }

    public String getName() {
        return "rose";
    }

    @Override
    public int compareTo(Rose other) {
        int result = getSize() - other.getSize();
        if (result != 0) {
            return result;
        }
        return getColour().compareTo(other.getColour());
    }
}
