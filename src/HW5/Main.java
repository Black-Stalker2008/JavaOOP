package HW5;

import HW5.Model.StudentModel;
import HW5.Model.TeacherModel;
import HW5.View.UserView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherModel teacher = new TeacherModel("Alexandr Sergeevich", 52, "001");
        StudentModel student1 = new StudentModel("Andrey Andreev", 19, "a001");
        StudentModel student2 = new StudentModel("Semen Ivanov", 20, "a002");
        UserView userView = new UserView();
        userView.saveGroup(new TeacherModel(teacher.getTeacherId()),
                (List.of(new StudentModel(student1.getStudentId()), new StudentModel(student2.getStudentId()))), "group1");
        userView.getGroup("group1");
//        userView.getGroup("group2");
    }
}