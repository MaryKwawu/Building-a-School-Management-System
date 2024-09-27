package schoolManagentSystem;
//This class keeps track of students Id, Name, grade, Fees paid, Fees total

public class Student {
    /**
     * objects
     */
    private  int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * construstor: create a new student by initializing
     *  fess for every student is GH60000
     *  fees paid initially is GH0
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=30000;

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
     * Add the Fees to the fees paid t
     *  feespaid = 2000 + 3000 + 4000
     *  And the fees to the fees paid
     * @param fees
     */
    public void payFees(int fees){
    feesPaid+=fees;

    //method call used here based on making updateTotalMoneyEarned
    School.updateTotalMoneyEarned(feesPaid);
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
        return feesPaid;
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
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
