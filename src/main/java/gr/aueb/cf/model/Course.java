package gr.aueb.cf.model;

import gr.aueb.cf.enums.LessonType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String title;

    @Column(length = 1000)
    private String comments;

    @Enumerated(EnumType.STRING)    // για λόγους αναγνωσιμότητας, αποθηκεύουμε το enum ως String - αντί για ordinal (0, 1, 2)
    @Column(name = "lesson_type")
    private LessonType lessonType;

}
