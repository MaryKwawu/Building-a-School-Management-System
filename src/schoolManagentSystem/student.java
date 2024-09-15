package schoolManagentSystem;
//This class keeps track of students Id, Name, grade, Fees paid, Fees total

public class student {
    //objects
    private  int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;


    /**
     * construstor: create a new student by initializing
     * fess for every student is GH6,000
     * fees paid initially is GH0
     *
     */

    public student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feespaid = 6000;
        this.feestotal = 0;

    }
/**
 *
 * update student value
 * getter
 */

public void setGrade(int grade){
    this.grade = grade;

}


/**
 * Keep adding the fees to the fees paid
 *  * Fees that the student pays
 *  * feespaid = 2000 + 3000 + 4000
 *  * And the fees to the fees paid
 */

public void updateFeesPaid(int fees){
    feespaid+=fees;
}
}
