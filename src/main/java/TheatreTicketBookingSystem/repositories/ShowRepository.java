package TheatreTicketBookingSystem.repositories;


import TheatreTicketBookingSystem.domain.Show;
import org.springframework.data.repository.CrudRepository;

public interface ShowRepository extends CrudRepository<Show, String> {
}
