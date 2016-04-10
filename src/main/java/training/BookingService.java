package training;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {


    private List<Booking> bookingList = new ArrayList<>();

    public Booking getBooking(int id){
        return bookingList.stream().findFirst().filter(e -> e.getId() == id).get();
    }

    public boolean deleteBooking(int id){
        return bookingList.removeIf(e -> e.getId() == id);
    }

    public boolean addBooking(Booking booking){
        return bookingList.add(booking);
    }
}
