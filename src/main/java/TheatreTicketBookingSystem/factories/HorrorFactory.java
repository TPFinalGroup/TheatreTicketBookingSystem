package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Horror;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class HorrorFactory {
    public static Horror getHorror(Map<String, Object> values){
        Horror factoryHorror = new Horror.Builder()
                .movie_id((Integer)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .build();
        return factoryHorror;
    }
}
