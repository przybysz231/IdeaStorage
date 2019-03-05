package pl.ideas.ideastorage;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Idea {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
}
