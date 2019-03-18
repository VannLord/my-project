package Day1;

public class Furama {
    private Villa[] villas;
    private House[] houses;
    private SwimmingPool[] swimmingPools;
    public Furama(int numberOfVilla,int numberOfHouse,int numberOfSwimmingPool){
        this.villas = new Villa[numberOfVilla];
        this.houses = new House[numberOfHouse];
        this.swimmingPools = new SwimmingPool[numberOfSwimmingPool];
    }

    public Villa[] getVillas() {
        return villas;
    }

    public void setVillas(Villa[] villas) {
        this.villas = villas;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public SwimmingPool[] getSwimmingPools() {
        return swimmingPools;
    }

    public void setSwimmingPools(SwimmingPool[] swimmingPools) {
        this.swimmingPools = swimmingPools;
    }

    public void listOfVilla(){
        for (int i = 0;i < villas.length;i++) {
            System.out.println("Villa("+(i+1)+"):"+villas[i]);
        }

    }
    public void listOfHouse(){
        for (int i = 0; i <houses.length ; i++) {
            System.out.println("House("+(i+1)+"):"+houses[i]);
        } {
        }
    }
}
