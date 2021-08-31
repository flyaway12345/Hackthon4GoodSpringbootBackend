package jpmc.team48.MetorshipApplication.controller;

import jpmc.team48.MetorshipApplication.objects.Mentor;
import jpmc.team48.MetorshipApplication.service.MentorshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/mentor/")
public class MentorshipController {
    @Autowired
    private MentorshipService mentorshipService;


        @GetMapping("/")
        public Mentor getByid(){
            return mentorshipService.findById(Mentor);
        }
}
