package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Seating_Plan {
    @Id
    @GeneratedValue
    private int seat_plan_id;   //pk
    private int seats_booked;
    private int seats_avail;
    private int seats;

    public int getSeat_plan_id() {
        return seat_plan_id;
    }

    public int getSeats_booked() {
        return seats_booked;
    }

    public int getSeats_avail() {
        return seats_avail;
    }

    public int getSeats() {
        return seats;
    }

    public Seating_Plan(Builder builder){
        this.seat_plan_id = builder.seat_plan_id;
        this.seats_booked = builder.seats_booked;
        this.seats_avail = builder.seats_avail;
        this.seats = builder.seats;
    }

    public static class Builder{
        private int seat_plan_id;   //pk
        private int seats_booked;
        private int seats_avail;
        private int seats;


        public Builder seat_plan_id(int seat_plan_id) {
            this.seat_plan_id = seat_plan_id;
            return this;
        }
        public Builder seats_booked(int seats_booked) {
            this.seats_booked = seats_booked;
            return this;
        }

        public Builder seats_avail(int seats_avail) {
            this.seats_avail = seats_avail;
            return this;
        }

        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }
//        public Builder recipe(Recipe recipe) {
//            this.recipe = recipe;
//            return this;
//        }
//
//        public Builder viewer(Viewer viewer) {
//            this.viewer = viewer;
//            return this;
//        }

        public Seating_Plan build(){
            return  new Seating_Plan(this);
        }
    }
}
