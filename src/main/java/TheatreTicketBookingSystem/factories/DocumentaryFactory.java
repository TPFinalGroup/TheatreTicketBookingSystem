package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Documentary;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class DocumentaryFactory {
    public static Documentary getDocumentary(Map<String, Object> values){
        Documentary factoryDocumentary = new Documentary.Builder()
                .movie_id((Integer)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .build();
        return factoryDocumentary;
    }
}
