package gr.aueb.cf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "teacher_more_info")
public class TeacherMoreInfo {

    private Long id;
    private LocalDate dateOfBirth;
}
