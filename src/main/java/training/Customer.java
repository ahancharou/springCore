package training;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String name = "empty";
    private String surname = "empty";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return name+" "+surname;
    }
}
