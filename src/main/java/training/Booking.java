package training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class Booking {
    private static int seq = 1;
    private int id;
    private String name;
    private Date date;
    private int seat;
    private int price;
    @Autowired
    private Customer owner;

    public void setup(){
        this.id = seq;
        seq++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String toString(){
        return "Booking to the "+name+" on "+date+" seat "+seat+" sold to "+owner+ " for "+price;
    }
}
