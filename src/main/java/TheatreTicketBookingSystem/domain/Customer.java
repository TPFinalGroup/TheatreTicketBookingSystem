package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int customer_id;
    private String name;
    private String surname;
    private String email;
    private String cell;

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCell() {
        return cell;
    }

    public Customer(Builder builder){
        this.customer_id = builder.customer_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.cell = builder.cell;
    }

    public static class Builder{
        private int customer_id;            //pk
        private String name;
        private String surname;
        private String email;
        private String cell;

        public Builder customer_id(int customer_id) {
            this.customer_id = customer_id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cell(String cell) {
            this.cell = cell;
            return this;
        }

        public Customer build(){
            return  new Customer(this);
        }
    }

}
