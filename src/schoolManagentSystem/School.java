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
    private List<Teacher> teacher;
    private List<Student> student;
    private int totalmoneyearned;
    private int totalmoneyspent;

    /**
     *
     * @param teacher list of teachers in the school
     * @param student list of students in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalmoneyearned = 0;
        totalmoneyspent = 0;

    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    public void setTotalmoneyearned(int totalmoneyearned) {
        this.totalmoneyearned = totalmoneyearned;
    }

    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    public void setTotalmoneyspent(int totalmoneyspent) {
        this.totalmoneyspent = totalmoneyspent;
    }
}
