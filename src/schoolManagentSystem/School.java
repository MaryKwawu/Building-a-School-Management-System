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
    private int totalmoneyearned;
    private int totalmoneyspent;

    /**
     *
     * @param teacher list of teachers in the school
     * @param student list of students in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalmoneyearned = 0;
        totalmoneyspent = 0;

    }

    /**
     * return the list of teachers in the school
     * @return
     */

    public List<Teacher> getTeacher() {
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
     * @return the students in a schoo
     */
    public List<Student> getStudent() {
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
    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    /**
     * Adds the total money earn by the school
     * @param moneyearned that that is suposed to be added
     */
    public void updateTotalmoneyearned(int moneyearned) {
        totalmoneyearned += moneyearned;
    }

    /**
     *
     * @return the list of money earned
     */
    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    /**
     * update the total money spent by the school,
     * the salary given by school to teachers
     * @param moneyspent the money that is spent by school
     */
    public void updateTotalmoneyspent(int moneyspent) {
        totalmoneyspent-=moneyspent;
    }
}
