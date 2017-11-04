package TheatreTicketBookingSystem.services.Impl;

import TheatreTicketBookingSystem.domain.Show;
import TheatreTicketBookingSystem.repositories.ShowRepository;
import TheatreTicketBookingSystem.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 2017/11/04.
 */

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepository repository;
    @Override
    public Show create(Show entity) {
        return repository.save(entity) ;
    }

    @Override
    public Show readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Show> readAll() {
        Iterable<Show> shows =repository.findAll();
        Set ShowSet = new HashSet();
        for(Show show:shows){
            ShowSet.add(show);
        }
        return ShowSet;
    }

    @Override
    public Show update(Show entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Show entity) {
        repository.delete(entity);
    }
}
