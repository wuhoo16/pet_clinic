package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity {
    @JoinColumn(name = "description")
    private String description;

}
