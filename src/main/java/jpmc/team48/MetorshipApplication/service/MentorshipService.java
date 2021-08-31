package jpmc.team48.MetorshipApplication.service;

import jpmc.team48.MetorshipApplication.objects.Mentor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface MentorshipService extends CrudRepository<Mentor, Long> {


}
