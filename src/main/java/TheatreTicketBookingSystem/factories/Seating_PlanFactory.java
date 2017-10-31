package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Seating_Plan;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class Seating_PlanFactory {
    public static Seating_Plan getSeating_Plan(Map<String, Object> values){
        Seating_Plan factorySeating_Plan = new Seating_Plan.Builder()
                .seat_plan_id((Integer)values.get("seat_plan_id"))
                .seats_avail((Integer)values.get("seats_avail"))
                .seats((Integer)values.get("seats"))
                .seats_booked((Integer)values.get("seats_booked"))
                .build();
        return factorySeating_Plan;
    }
}
