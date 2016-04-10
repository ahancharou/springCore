import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import training.Booking;
import training.BookingService;
import training.Configuration;

import java.sql.Date;


public class Runner {

    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("resources/configuration.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Booking booking = context.getBean(Booking.class);

        BookingService bookingService = context.getBean(BookingService.class);

        booking.setName("SomeMovie");
        booking.setDate(Date.valueOf("2016-10-22"));
        booking.setPrice(2000);
        booking.setSeat(21);
        booking.getOwner().setName("Bill");
        booking.getOwner().setSurname("Murray");
        System.out.println(booking);
        int id = booking.getId();
        bookingService.addBooking(booking);

        Booking searchBooking = bookingService.getBooking(id);
        System.out.println(searchBooking);

        boolean deleted = bookingService.deleteBooking(id);

        System.out.println(deleted);
    }
}
