import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import entity.Teacher;
import manager.TeacherDao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();


        teacherDao.addTeacher(new Teacher(4,"Aytaj","Mammadli",78));


        System.out.println(teacherDao.getAll());
        System.out.println(teacherDao.getById(2));

        List<Teacher> lists2=teacherDao.getAll().stream().filter(lists->lists.getAge()>40).collect(Collectors.toList());
        System.out.println(lists2);


    }
}
