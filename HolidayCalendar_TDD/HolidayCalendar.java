public class HolidayCalendar {

    public HolidayCalendar() {

    }

    public boolean isHoliday(MyDate date) {
        boolean res = false;
        if(date.getDay() == "Domingo")
            res = true;
        return res;
    }
}
