package jpmc.team48.MetorshipApplication.objects.people;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Mentor extends Person {
    private String position;
    private String[] availability;

    public Mentor() {
    }

    public Mentor(Long id, String firstName, String lastName, String position, String[] availability) {
        super(id, firstName, lastName);
        this.position = position;
        this.availability = availability;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String[] getAvailability() {
        return availability;
    }

    public void setAvailability(String[] availability) {
        this.availability = availability;
    }
}
