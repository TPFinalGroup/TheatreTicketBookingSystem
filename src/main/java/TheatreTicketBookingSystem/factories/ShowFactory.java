package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Show;

import java.util.Date;
import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class ShowFactory {
    public static Show getShow(Map<String, Object> values){
        Show factoryShow = new Show.Builder()
                .show_id((Integer)values.get("show_id"))
                .movie_id((Integer)values.get("movie_id"))
                .time((String)values.get("time"))
                .show_date((Date) values.get("show_date"))
                .build();
        return factoryShow;
    }
}
