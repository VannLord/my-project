package Day1;

public class Villa extends Accomodation{
    private final int pricePerDay = 10;

    public Villa() {
    }

    public Villa(String name, double size, double price) {
        super(name, size, price);
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public int getPriceOfVilla(int numberOfDay, int numberOfVila){
        return pricePerDay*numberOfDay*numberOfVila;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "pricePerDay=" + pricePerDay +
                '}';
    }
}
