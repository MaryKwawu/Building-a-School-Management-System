import schoolManagentSystem.School;
import schoolManagentSystem.Student;
import schoolManagentSystem.Teacher;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * creating Teacher Object
         */
        int teacherId1 = 1;
        String teacherName1= "Marie";
        int teacherSalary1 = 20000;
        Teacher marie = new Teacher(teacherId1, teacherName1, teacherSalary1);

        int teacherId2 = 3;
        String teacherName2 = "Wiseborn";
        int teacherSalary2 = 60000;
        Teacher wiseborn = new Teacher(teacherId2, teacherName2, teacherSalary2);

        int teacherId3 = 3;
        String teacherName3 = "Joseph";
        int teacherSalary3 = 60000;
        Teacher joseph = new Teacher(teacherId3, teacherName3, teacherSalary3);

        List <Teacher> teacherList = new ArrayList<>();
        teacherList.add(marie);
        teacherList.add(wiseborn);
        teacherList.add(joseph);









    }
}