package TheatreTicketBookingSystem.repositories;

import TheatreTicketBookingSystem.domain.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
