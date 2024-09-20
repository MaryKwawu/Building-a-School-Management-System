package schoolManagentSystem;
//This class keeps track of students Id, Name, grade, Fees paid, Fees total

public class Student {
    /**
     * objects
     */
    private  int id;
    private String name;
    private int grade;
    private int payFees;
    private int feesTotal;


    /**
     * construstor: create a new student by initializing
     *  fess for every student is GH6,000
     *  fees paid initially is GH0
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.payFees = 0;
        this.feesTotal = 60000;

    }

    /**
     * update student value
     * set grade
     * @param grade
     */

public void setGrade(int grade){
    this.grade = grade;

}


    /**
     * * Keep adding the fees to the fees paid
     * Fees that the student pays
     *  feespaid = 2000 + 3000 + 4000
     *  And the fees to the fees paid
     * @param fees
     */
    public void payFees(int fees){
    payFees +=fees;

    //method call used here based on making updateTotalMoneyEarned
    School.updateTotalMoneyEarned(payFees);
}


    /**
     *
     * @return the id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */
    public int getFeesPaid() {
        return payFees;
    }

    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }


    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - payFees;
    }




}
