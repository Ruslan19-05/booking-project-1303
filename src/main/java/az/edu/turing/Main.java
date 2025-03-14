package az.edu.turing;

import az.edu.turing.entity.Students;
import az.edu.turing.repositroy.StudentsImpl;
import az.edu.turing.repositroy.StudentsRepository;

public class Main {

    public static void main(String[] args) {
        Students students=new Students(1,"Ruslan34","ruslan@gmail.com",1);
        StudentsRepository studentsRepository=new StudentsImpl();
        studentsRepository.create_student(students);
    }
}
