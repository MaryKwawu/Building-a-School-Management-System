package schoolManagentSystem;

/**This class keeps track of teachers
 * Id
 * Name
 * Salary
 */


public class Teacher {
    private int id;
    private String name;
    private int salary;


    /**
     * creates a new teacher object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
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
     * @return name of teacher
     */

    public String getName(){
        return name;
    }


    /**
     *
     * @return salary of teacher
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
}
