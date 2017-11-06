package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Viewing;

import java.util.Date;
import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class ShowFactory {
    public static Viewing getShow(Map<String, Object> values){
        Viewing factoryShow = new Viewing.Builder()
                .show_id((Long)values.get("show_id"))
                .movie_id((Integer)values.get("movie_id"))
                .time((String)values.get("time"))
                .show_date((Date) values.get("show_date"))
                .build();
        return factoryShow;
    }
}
