package Day1;

public class House extends Accomodation{
    private final int pricePerDay = 5;

    public House() {
    }

    public House(String name, double size, double price) {
        super(name, size, price);
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public int getPriceOfHouse(int numberOfDay, int numberOfHouse){
        return pricePerDay*numberOfDay*numberOfHouse;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "pricePerDay=" + pricePerDay +
                '}';
    }
}
