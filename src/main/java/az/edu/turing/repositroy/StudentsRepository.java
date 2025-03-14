package az.edu.turing.repositroy;

import az.edu.turing.entity.Groups;
import az.edu.turing.entity.Students;

import java.util.List;

public interface StudentsRepository {

    void create_student (Students students);

    void update_student(Students students);

    void delete_student(int student_id);

    Students findStudentsGroup(Groups groups);

    List<Students> getAllStudents();
}
