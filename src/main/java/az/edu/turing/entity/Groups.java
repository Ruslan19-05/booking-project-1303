package az.edu.turing.entity;

public class Groups {

    private Integer groups_id;
    private String groups_name;
    private String description;

    public Groups(Integer groups_id, String groups_name, String description) {
        this.groups_id = groups_id;
        this.groups_name = groups_name;
        this.description = description;
    }

    public Integer getGroups_id() {
        return groups_id;
    }

    public void setGroups_id(Integer groups_id) {
        this.groups_id = groups_id;
    }

    public String getGroups_name() {
        return groups_name;
    }

    public void setGroups_name(String groups_name) {
        this.groups_name = groups_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groups_id=" + groups_id +
                ", groups_name='" + groups_name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

