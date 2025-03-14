package az.edu.turing.entity;

public class Students {

    private Integer students_id;
    private String students_name;
    private String students_email;
    private Integer group_id;

    public Students(Integer students_id, String students_name, String students_email, Integer group_id) {
        this.students_id = students_id;
        this.students_name = students_name;
        this.students_email = students_email;
        this.group_id = group_id;
    }

    public Students(String students_name, String students_email, Integer group_id) {
        this.students_name = students_name;
        this.students_email = students_email;
        this.group_id = group_id;
    }

    public Integer getStudents_id() {
        return students_id;
    }

    public void setStudents_id(Integer students_id) {
        this.students_id = students_id;
    }

    public String getStudents_name() {
        return students_name;
    }

    public void setStudents_name(String students_name) {
        this.students_name = students_name;
    }

    public String getStudents_email() {
        return students_email;
    }

    public void setStudents_email(String students_email) {
        this.students_email = students_email;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "students_id=" + students_id +
                ", students_name='" + students_name + '\'' +
                ", students_email='" + students_email + '\'' +
                ", group_id=" + group_id +
                '}';
    }
}
