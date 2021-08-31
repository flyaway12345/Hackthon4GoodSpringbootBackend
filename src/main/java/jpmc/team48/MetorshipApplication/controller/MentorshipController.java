package jpmc.team48.MetorshipApplication.controller;

import jpmc.team48.MetorshipApplication.objects.Mentor;
import jpmc.team48.MetorshipApplication.service.MentorshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/mentor/")
public class MentorshipController {
    @Autowired
    private MentorshipService mentorshipService;


        @GetMapping("{id}")
        public Optional<Mentor> findById(Long id){
            return mentorshipService.findById(id);
        }

        @GetMapping("")
        public Object findAll(){
            return mentorshipService.findAll();
        }

        @PostMapping("")
        public Object save(Mentor mentor){
            return mentorshipService.save(mentor);
        }

    @DeleteMapping("{id}")
    public Optional<Mentor> deleteById(Long id){
        mentorshipService.deleteById(id);
        return null;
    }

    @PutMapping("{id}")
    public Optional<Mentor> update(Mentor mentor, Long id){
            if(mentor.getId() == id) {
                mentorshipService.save(mentor);
            }

            return null;
    }

}
