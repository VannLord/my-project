package Day1;

import java.sql.Time;
import java.util.Date;

public class SwimmingPool {
    private int swimmingOpenTime = 540;

    public int getSwimmingOpenTime() {
        return swimmingOpenTime;
    }

    public void setSwimmingOpenTime(int swimmingOpenTime) {
        this.swimmingOpenTime = swimmingOpenTime;
    }
    public void openTime(){
        System.out.println("Swimming pool is opened at: "+swimmingOpenTime/60+"a.m");
    }
    public void note () {
        Date date = new Date();
        System.out.println("It's "+date.toString());
        if(swimmingOpenTime < date.getHours()*60+date.getMinutes()){
            System.out.println("Ready for your swimming. Enjoy it!!");
        }
        else{
            System.out.println("Swimming pool isn't ready to welcome you. Please come back at 9a.m");
        }

    }

}
