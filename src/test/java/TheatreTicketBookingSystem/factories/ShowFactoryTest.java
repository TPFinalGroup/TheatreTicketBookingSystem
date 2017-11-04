package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Show;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/11/04.
 */
public class ShowFactoryTest {

    Map<String, Object> values;
    Show show;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("show_id", 100);
        values.put("movie_id", 100);
        values.put("show_date", new Date());
    }

    @Test
    public void getShow() throws Exception {
        show = ShowFactory.getShow(values);
        assertEquals(100, show.getMovie_Id());
    }

}