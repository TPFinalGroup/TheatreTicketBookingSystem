package TheatreTicketBookingSystem.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Viewing {
    @Id
    @GeneratedValue
    private Long id;
//    private int movie_id;       //fk
//    private Date show_date;
//    private String time;
//    private int seat_plan_id;   //fk
//    @OneToMany(mappedBy = "reservation_id")
//    private List<Reservation> reservation;
//
////    private List<? extends Seating_Class> seats;
////
////    public List<? extends Seating_Class> getSeats() {
////        return seats;
////    }
//
//    public Long getShow_Id() {
//        return show_id;
//    }
//
//    public List<Reservation> getReservation() {
//        return reservation;
//    }
//
//    public int getMovie_Id() {
//        return movie_id;
//    }
//
//    public Date getShow_date() {
//        return show_date;
//    }
//
//    public String getTime() {
//        return time;
//    }

//    public int getSeat_plan_id() {
//        return seat_plan_id;
//    }
    public Viewing() {}
    public Viewing(Builder builder){
        this.id = builder.id;
//        this.movie_id = builder.movie_id;
//        this.show_date = builder.show_date;
//        this.time = builder.time;
//        this.seat_plan_id = builder.seat_plan_id;
//        this.reservation = builder.reservation;
       // this.seats = builder.seats;
    }

    public static class Builder{
        private Long id;
        private int movie_id;       //fk
        private Date show_date;
        private String time;
        private int seat_plan_id;   //fk
        private List<Reservation> reservation;
       // private List<? extends Seating_Class> seats;

//        public Builder seats(List<? extends Seating_Class> seats) {
//            this.seats = seats;
//            return this;
//        }

        public Builder show_id(Long show_id) {
            this.id = show_id;
            return this;
        }

        public Builder reservation(List<Reservation> reservation) {
            this.reservation = reservation;
            return this;
        }

        public Builder movie_id(int movie_id) {
            this.movie_id = movie_id;
            return this;
        }

        public Builder show_date(Date show_date) {
            this.show_date = show_date;
            return this;
        }

        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public Builder seat_plan_id(int seat_plan_id) {
            this.seat_plan_id = seat_plan_id;
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

        public Viewing build(){
            return  new Viewing(this);
        }
    }
}
