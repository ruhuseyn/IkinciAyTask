package manager;

import dataAccess.TeacherRepository;
import entity.Teacher;
import exception.MyException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao implements TeacherRepository {

    static List<Teacher> teachers;


    static {

        teachers = new ArrayList<>();


        teachers.add(new Teacher(1, "Vazifa","Guliyeva",24));
        teachers.add(new Teacher(2,"Orxan","Imanli",34));
    }


    @Override
    public Teacher getById(Integer id) {



        return teachers.get(id);
    }

    @Override
    public void addTeacher(Teacher teacher) {

        if(teacher.getAge()>65){
            throw new MyException("65 den yuxari muellim olmaz");
        }

        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
}
