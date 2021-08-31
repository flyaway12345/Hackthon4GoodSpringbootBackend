package jpmc.team48.MetorshipApplication.objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import java.text.DateFormat;
import java.util.List;

@Entity
public class Mentor extends Person{
    private String position;

}
