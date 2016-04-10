package training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @Scope("prototype")
    public Customer customer() {
        return new Customer();
    }

    @Bean(initMethod = "setup")
    @Scope("prototype")
    public Booking booking(){
        return new Booking();
    }

    @Bean
    @Scope("singleton")
    public BookingService bookingService() {return new BookingService();}
}
