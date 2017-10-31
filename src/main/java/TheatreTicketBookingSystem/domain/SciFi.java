package TheatreTicketBookingSystem.domain;

import TheatreTicketBookingSystem.domain.Intefaces.Movie;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Hasan on 10/31/2017.
 */
public class SciFi implements Movie
{
    @Id
    @GeneratedValue
    private int movie_id;
    private int duration;
    private String title;

    public SciFi()
    {

    }

    public int getMovie_Id()
    {
        return movie_id;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

//    @ManyToOne(optional=false)
//    private Recipe recipe;

    public SciFi(Builder builder){
        this.movie_id = builder.movie_id;
        this.duration = builder.duration;
        this.title = builder.title;
    }

    public static class Builder{

        private int movie_id;
        private String title;
        private int duration;
//        private Recipe recipe;
//        private Viewer viewer;

        public Builder movie_id(int movie_id) {
            this.movie_id = movie_id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
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

        public SciFi build(){
            return  new SciFi(this);
        }
    }
}