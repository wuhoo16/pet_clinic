package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity {
    @JoinColumn(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
