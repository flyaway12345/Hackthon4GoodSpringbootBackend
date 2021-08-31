package jpmc.team48.MetorshipApplication.controller;

import jpmc.team48.MetorshipApplication.repoistories.MentorshipRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/mentor/")
public class MentorshipController {
    @Autowired
    private MentorshipRepositories mentorshipRepositories;


        @GetMapping("{id}")
        public Optional findById(int id){
            return mentorshipRepositories.findById(id);
        }
}
