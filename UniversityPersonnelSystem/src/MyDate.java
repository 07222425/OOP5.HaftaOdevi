public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        java.util.Date date = new java.util.Date(elapsedTime);
        java.util.Calendar cal = new java.util.GregorianCalendar();
        cal.setTime(date);
        this.year = cal.get(java.util.Calendar.YEAR);
        this.month = cal.get(java.util.Calendar.MONTH);
        this.day = cal.get(java.util.Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}