package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Show {
    @Id
    @GeneratedValue
    private int show_id;
    private int movie_id;       //fk
    private Date show_date;
    private String time;
    private int seat_plan_id;   //fk


    public int getShow_Id() {
        return show_id;
    }

    public int getMovie_Id() {
        return movie_id;
    }

    public Date getShow_date() {
        return show_date;
    }

    public String getTime() {
        return time;
    }

    public int getSeat_plan_id() {
        return seat_plan_id;
    }

    public Show(Builder builder){
        this.show_id = builder.show_id;
        this.movie_id = builder.movie_id;
        this.show_date = builder.show_date;
        this.time = builder.time;
        this.seat_plan_id = builder.seat_plan_id;
    }

    public static class Builder{
        private int show_id;
        private int movie_id;       //fk
        private Date show_date;
        private String time;
        private int seat_plan_id;   //fk
//        private Recipe recipe;
//        private Viewer viewer;


        public Builder show_id(int show_id) {
            this.show_id = show_id;
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

        public Show build(){
            return  new Show(this);
        }
    }
}
