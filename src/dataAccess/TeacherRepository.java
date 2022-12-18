package dataAccess;

import entity.Teacher;

import java.util.List;

public interface TeacherRepository {
    Teacher getById(Integer id);
    void addTeacher(Teacher teacher);
    List<Teacher> getAll();

}
