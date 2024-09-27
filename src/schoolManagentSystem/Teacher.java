package schoolManagentSystem;

/**This class keeps track of teachers
 * Id
 * Name
 * Salary
 */


public class Teacher {
    //object
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * creates a new teacher object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id of the teacher
     */

    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */

    public String getName(){
        return name;
    }


    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }


    /**
     * Adds to salaryEarned
     * Remove from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Name of the Teacher='" + name + '\'' +
                ", salary=" + salary +
                ", Total salary earned so far $=" + salaryEarned +
                '}';
    }
}



