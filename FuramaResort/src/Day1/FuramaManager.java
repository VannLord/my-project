package Day1;

public class FuramaManager {



    public static void main(String[] args) {
        Furama furama = new Furama(5,2,1);
        /**
         *
         * Day1
         */
        Customer customer1 = new Customer(19," Tang Van Loc");
        ResortBill resortBill = new ResortBill();
        SwimmingPool swimmingPool = new SwimmingPool();
        resortBill.printReceipt(customer1,4,1,4,2);
        swimmingPool.openTime();
        swimmingPool.note();
        /**
         * Day2
         */
        furama.listOfVilla();
        furama.listOfHouse();
        /**
         * Day3
         */
        /**
         * Day4: Nothing to run
         */
        resortBill.addCustomer("Son");
        resortBill.addCustomer("Van");
        resortBill.addCustomer("Sang");
        resortBill.addCustomer("Quang");
        resortBill.addCustomer("Hoang");
        resortBill.addCustomer("Dung");
        resortBill.addCustomer("Dũng");
        resortBill.addCustomer("Nam");
        resortBill.addCustomer("Cuc");
        resortBill.addCustomer("Linh");
        resortBill.addCustomer("Yoon");
        resortBill.listOfCustomer();
        /**
         * Day5: Bullshit task
          */
        /**
         * Day6
         */


    }
}
