package test_scripts;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class calendarDates extends DriverWrapper {
    @Test
    public void selectCurrentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String today = sdf.format(date);
        System.out.println(date);

    }

}
