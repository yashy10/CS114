import java.util.Date;
public class Lab_DateObject {

    public static void main(String[] args) {
        Date date = new Date();

        date.setTime(10000);
        System.out.println("date and time after 10,000 milliseconds elapsed is:  " + date);
        date.setTime(100000);
        System.out.println("date and time after 100,000 milliseconds elapsed is:  " + date.toString());
        date.setTime(1000000);
        System.out.println("date and time after 1,000,000 milliseconds elapsed is:  " + date.toString());
        date.setTime(10000000);
        System.out.println("date and time after 10,000,000 milliseconds elapsed is:  " + date.toString());
        date.setTime(100000000);
        System.out.println("date and time after 100,000,000 milliseconds elapsed is:  " + date.toString());
        date.setTime(1000000000);
        System.out.println("date and time after 1,000,000,000 milliseconds elapsed is:  " + date.toString());
        date.setTime(10000000000L);
        System.out.println("date and time after 10,000,000,000 milliseconds elapsed is:  " + date.toString());
        date.setTime(100000000000L);
        System.out.println("date and time after 100,000,000,000 milliseconds elapsed is:  " + date.toString());

    }

}
