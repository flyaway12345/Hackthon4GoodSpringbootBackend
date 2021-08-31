package jpmc.team48.MetorshipApplication.repoistories;

import jpmc.team48.MetorshipApplication.objects.Mentor;
import jpmc.team48.MetorshipApplication.service.MentorshipService;

import java.util.Optional;

public abstract class MentorshipRepositories implements MentorshipService {
    private MentorshipService mentorshipService;

    public Object save(Mentor mentor) {
        return mentorshipService.save(mentor);
    }

    public Optional findById(Mentor mentor) {
        return mentorshipService.findById(mentor.getId());
    }

    public boolean existsById(Mentor mentor) {
        return mentorshipService.existsById(mentor.getId());
    }

    public boolean existsById(Object o) {
        return false;
    }

    public Iterable findAll() {
        return mentorshipService.findAll();
    }


    public long count() {
        return 0;
    }

    public Iterable findAllById(Mentor mentor) {
        return mentorshipService.findAllById(mentor.getId());
    }



    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }


}
