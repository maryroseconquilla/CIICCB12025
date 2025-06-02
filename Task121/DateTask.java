package Task121;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTask {
    private int day;
    private int month;
    private int year;

    // No-args constructor
    public DateTask() {
        this(1, 1, 1); // Calls the parameterized constructor
    }

    // Parameterized constructor
    public DateTask(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Setter for day
    public void setDay(int day) {
        if (day >= 1 && day <= 31) { // Basic validation for day
            this.day = day;
        } else {
            this.day = 0; // Return 0 if condition is false
        }
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Setter for month
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) { // Basic validation for month
            this.month = month;
        } else {
            this.month = 0; // Return 0 if condition is false
        }
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        if (year >= 0) { // Basic validation for year (can be adjusted as needed)
            this.year = year;
        } else {
            this.year = 0; // Return 0 if condition is false
        }
    }

    @Override
    public String toString() {
        // Create a Date object from the stored day, month, and year
        // Note: This is a simplified approach and doesn't handle date validity perfectly
        // For robust date handling, consider java.time.LocalDate or a calendar library
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(String.format("%02d/%02d/%04d", day, month, year));
            return sdf.format(date);
        } catch (java.text.ParseException e) {
            return "Invalid Date"; // Handle parsing errors
        }
    }

    public static void main(String[] args) {
        DateTask date1 = new DateTask(); // Uses no-args constructor, sets to 1/1/1
        System.out.println("Date 1: " + date1);

        DateTask date2 = new DateTask(12, 12, 2012);
        System.out.println("Date 2: " + date2);

        DateTask date3 = new DateTask(35, 13, 2020); // Invalid day and month
        System.out.println("Date 3 (invalid): " + date3);
        System.out.println("Day of Date 3: " + date3.getDay());
        System.out.println("Month of Date 3: " + date3.getMonth());
    }
}