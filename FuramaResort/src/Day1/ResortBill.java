package Day1;

import java.util.ArrayList;
import java.util.List;

public class ResortBill {
    List<String> customers = new ArrayList<>();
    Villa villa = new Villa();
    House house = new House();
    Customer customer = new Customer(19,"Tang Van Loc");
    public void printReceipt(Customer customer,int numberOfRentingVillaDay,int numberOfRentedVilla,int numberOfRentingHouseDay,int numberOfRentedHouse){
        System.out.println("-----Receipt-----");
        System.out.println("Customer's name: "+customer.getName());
        System.out.println("Customer's age: "+customer.getAge());
        System.out.println("--------------");
        System.out.println("Number of Rented Villa: "+numberOfRentedVilla);
        System.out.println("Day's number of Renting Villa: "+numberOfRentingVillaDay);
        System.out.println("Price of a villa per day: "+villa.getPricePerDay());
        System.out.println("Money of renting villa: "+villa.getPriceOfVilla(numberOfRentingVillaDay,numberOfRentedVilla));
        System.out.println("--------------");
        System.out.println("Number of Rented House: "+numberOfRentedHouse);
        System.out.println("Day's number of Renting House: "+numberOfRentingHouseDay);
        System.out.println("Price of a house per day: "+house.getPricePerDay());
        System.out.println("Money of renting house: "+house.getPriceOfHouse(numberOfRentingHouseDay,numberOfRentedHouse));
        System.out.println("--------------");
    }
    public void addCustomer(String customer){
        customers.add(customer);
    }
    public void listOfCustomer(){
        System.out.println(customers);
    }

}
