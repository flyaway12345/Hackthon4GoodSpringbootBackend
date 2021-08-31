package jpmc.team48.MetorshipApplication.objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import java.text.DateFormat;
import java.util.List;

@Entity
public class Mentor extends Person{
    private String position;

    public Mentor() {

    }

    public Mentor(Long id, String firstName, String lastName, String position) {
        super(id, firstName, lastName);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "position='" + position + '\'' +
                '}';
    }
}
