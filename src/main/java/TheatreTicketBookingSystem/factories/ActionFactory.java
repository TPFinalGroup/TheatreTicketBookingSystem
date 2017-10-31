package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Action;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class ActionFactory {

    public static Action getAction(Map<String, Object> values){
        Action factoryAction = new Action.Builder()
                .movie_id((Integer)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .build();
        return factoryAction;
    }
}
