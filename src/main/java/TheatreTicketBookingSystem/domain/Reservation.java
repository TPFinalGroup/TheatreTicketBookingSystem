package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int reservation_id;      //pk
    private ArrayList<Integer> seats;
    private int total_price;
    private int show_id;            //fk
    private int customer_id;        //fk


    public int getReservation_id() {
        return reservation_id;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public int getTotal_price() {
        return total_price;
    }

    public int getShow_id() {
        return show_id;
    }

    public int getCustomer_id() {return customer_id;}

    public Reservation(Builder builder){
        this.reservation_id = builder.reservation_id;
        this.seats = builder.seats;
        this.total_price = builder.total_price;
        this.show_id = builder.show_id;
        this.customer_id = builder.customer_id;
    }

    public static class Builder{
        private int reservation_id;      //pk
        private ArrayList<Integer> seats;
        private int total_price;
        private int show_id;            //fk
        private int customer_id;        //fk


        public Builder reservation_id(int reservation_id) {
            this.reservation_id = reservation_id;
            return this;
        }

        public Builder seats(ArrayList<Integer> seats) {
            this.seats = seats;
            return this;
        }

        public Builder total_price(int total_price) {
            this.total_price = total_price;
            return this;
        }

        public Builder show_id(int show_id) {
            this.show_id = show_id;
            return this;
        }

        public Builder customer_id(int value)
        {
            this.customer_id = value;
            return this;
        }

        public Reservation build(){
            return  new Reservation(this);
        }
    }
}
