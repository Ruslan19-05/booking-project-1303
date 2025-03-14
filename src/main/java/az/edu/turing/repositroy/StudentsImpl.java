package az.edu.turing.repositroy;

import az.edu.turing.confing.ConnectionHelper;
import az.edu.turing.entity.Groups;
import az.edu.turing.entity.Students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentsImpl implements StudentsRepository{

    @Override
    public void create_student(Students students) {

        try (Connection connection= ConnectionHelper.getConnection()){
            String query="insert into students (students_id,students_name,email,group_id) values(?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,students.getStudents_id());
            preparedStatement.setString(2,students.getStudents_name());
            preparedStatement.setString(3,students.getStudents_email());
            preparedStatement.setInt(4,students.getGroup_id());
            int row=preparedStatement.executeUpdate();
            System.out.println(row+"inserted!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update_student(Students students) {

        try (Connection connection= ConnectionHelper.getConnection()){

            String query="update  students set students_id=?,students_name=?,email=?,group_id=? where students_id=?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,students.getStudents_id());
            preparedStatement.setString(2,students.getStudents_name());
            preparedStatement.setString(3,students.getStudents_email());
            preparedStatement.setInt(4,students.getGroup_id());
            preparedStatement.setInt(5,students.getStudents_id());
            int row=preparedStatement.executeUpdate();
            System.out.println(row+"updated!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete_student(int student_id) {

        try(Connection connection=ConnectionHelper.getConnection()){
            String query="delete from students where students_id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,student_id);
            int row =preparedStatement.executeUpdate();
            System.out.println(row+"deleted!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Students findStudentsGroup(Groups groups) {
        return null;
    }

    @Override
    public List<Students> getAllStudents() {
        return List.of();
    }
}
