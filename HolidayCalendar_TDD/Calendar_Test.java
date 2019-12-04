import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calendar_Test {

    public Calendar_Test() {
    }
    
    @Test
    public void Test1() {
        HolidayCalendar calendar = new HolidayCalendar();
        assertTrue(calendar.isHoliday());
    }

}
