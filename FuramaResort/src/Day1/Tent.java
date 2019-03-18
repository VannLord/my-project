package Day1;

public class Tent extends Accomodation{


    public Tent(String name, double size, double price) {
        super(name, size, price);
    }

    @Override
    public String toString() {
        return "Tent{"+super.toString()+"}";
    }
}
