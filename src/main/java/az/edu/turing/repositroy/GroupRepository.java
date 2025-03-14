package az.edu.turing.repositroy;

import az.edu.turing.entity.Groups;
import az.edu.turing.entity.Students;

import java.util.List;

public interface GroupRepository {

    void create_group (Groups groups);

    void update_group(Groups groups);

    void delete_group(int group_id);

    void createNewGroup(String groupName,String description);

    List<Groups> getAllGroup();
}
