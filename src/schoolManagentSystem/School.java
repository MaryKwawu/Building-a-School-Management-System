package schoolManagentSystem;

import java.util.List;

/**
 * using ArrayList
 * Implements teachers and students
 * I am using ArrayList
 * because we can never know
 * the total number of Teachers and student
 * present at a particular time.
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     *
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    /**
     * return the list of teachers in the school
     * @return
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *Adds a teacher to a school
     * @param teacher the teacher to be added
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the students in a school
     */
    public List<Student> getStudents() {
        return students;
    }


    /**
     *Adds students to a school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }


    /**
     *
     * @return the list of total money earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earn by the school
     * @param moneyEarned that is suposed to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the list of money earned
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the total money spent by the school,
     * the salary given by school to teachers
     * @param moneySpent the money that is spent by school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }


}
