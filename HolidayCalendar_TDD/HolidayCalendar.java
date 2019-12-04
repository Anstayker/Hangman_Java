public class HolidayCalendar {

    public HolidayCalendar() {

    }

    public boolean isHoliday(String dia) {
        boolean res = false;
        if(dia == "Domingo")
            res = true;
        return res;
    }
}
