package AssignmrntTracker;

public  class SpartansAssignment extends Assignment {

    public String batchName;


    public  void setBatchName(String batchName) {
        this.batchName = batchName;

    }

    public void diplay() {
        System.out.println("Assignment name is = "+assignmentName);
        System.out.println("Batch name is = "+batchName);
        System.out.println("Assignemnt link is = " +assignmentLink);
        System.out.println("Asssignment Password = "+assignmentPassword);
        System.out.println("NO of Questions =  "+noOfQuestions);

    }


    @Override
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @Override
    public void setAssignmentLink(String Link) {
        this.assignmentLink = Link;

    }

    @Override
    public void setAssignmentPassword(String Password) {
        this.assignmentPassword = Password;

    }

    @Override
    public void setNoOfQuestions(int noOfQuestions) {
        this.noOfQuestions = noOfQuestions;

    }

}
