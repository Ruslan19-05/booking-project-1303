package az.edu.turing.repositroy;

import az.edu.turing.confing.ConnectionHelper;
import az.edu.turing.entity.Groups;
import az.edu.turing.entity.Students;

import java.sql.*;
import java.util.List;

public class StudentsImpl implements StudentsRepository {

    @Override
    public void create_student(Students students) {

        try (Connection connection = ConnectionHelper.getConnection()) {
            String query = "insert into students (students_id,students_name,email,group_id) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, students.getStudents_id());
            preparedStatement.setString(2, students.getStudents_name());
            preparedStatement.setString(3, students.getStudents_email());
            preparedStatement.setInt(4, students.getGroup_id());
            int row = preparedStatement.executeUpdate();
            System.out.println(row + "inserted!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update_student(Students students) {

        try (Connection connection = ConnectionHelper.getConnection()) {

            String query = "update  students set students_id=?,students_name=?,email=?,group_id=? where students_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, students.getStudents_id());
            preparedStatement.setString(2, students.getStudents_name());
            preparedStatement.setString(3, students.getStudents_email());
            preparedStatement.setInt(4, students.getGroup_id());
            preparedStatement.setInt(5, students.getStudents_id());
            int row = preparedStatement.executeUpdate();
            System.out.println(row + "updated!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete_student(int student_id) {

        try (Connection connection = ConnectionHelper.getConnection()) {
            String query = "delete from students where students_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, student_id);
            int row = preparedStatement.executeUpdate();
            System.out.println(row + "deleted!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Students findStudentsGroup(Groups groups) {
        return null;
    }

    @Override
    public void createNewStudents(String studentName, String email, int groupId) {
        try (Connection connection = ConnectionHelper.getConnection()) {

            String query = "insert into students (students_name,email,group_id) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, studentName);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, groupId);
            int row = preparedStatement.executeUpdate();
            System.out.println(row + "created new students!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Students> getAllStudents() {

        try (Connection connection = ConnectionHelper.getConnection()) {

            String query = "select s.students_id,s.students_name,s.email,g.groups_name "
                    + "from students s "
                    + " left join groups g on s.group_id=g.id";
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                int studentId=resultSet.getInt("students_id");
                String studentName=resultSet.getString("students_name");
                String email=resultSet.getString("email");
                String groupName=resultSet.getString("groups_name");

                System.out.println("ID:"+studentId);
                System.out.println("Name:"+studentName);
                System.out.println("Email:"+email);
                System.out.println("Group:"+groupName);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return List.of();
    }
}
