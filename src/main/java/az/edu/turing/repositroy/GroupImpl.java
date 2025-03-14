package az.edu.turing.repositroy;

import az.edu.turing.confing.ConnectionHelper;
import az.edu.turing.entity.Groups;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class GroupImpl implements GroupRepository{
    @Override
    public void create_group(Groups groups) {

        try (Connection connection=ConnectionHelper.getConnection()){
            String query="insert into groups(id,groups_name,description) values(?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,groups.getGroups_id());
            preparedStatement.setString(2,groups.getGroups_name());
            preparedStatement.setString(3,groups.getDescription());
            int row=preparedStatement.executeUpdate();
            System.out.println(row+"inserted!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update_group(Groups groups) {
        try (Connection connection=ConnectionHelper.getConnection()){

            String query="update groups set id=?,groups_name=?,description=? where id=?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,groups.getGroups_id());
            preparedStatement.setString(2,groups.getGroups_name());
            preparedStatement.setString(3,groups.getDescription());
            preparedStatement.setInt(4,groups.getGroups_id());
            int row=preparedStatement.executeUpdate();
            System.out.println(row+"updated!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete_group(int group_id) {

        try (Connection connection=ConnectionHelper.getConnection()){

            String query="delete from groups where id=?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,group_id);
            int row=preparedStatement.executeUpdate();
            System.out.println(row+"deleted!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void createNewGroup(String groupName,String description){
        try(Connection connection=ConnectionHelper.getConnection()){

            String query="insert into groups (groups_name,description) values(?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1,groupName);
            preparedStatement.setString(2,description);
            int row=preparedStatement.executeUpdate();
            System.out.println(row+" new group created!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Groups> getAllGroup() {
        return List.of();
    }
}
