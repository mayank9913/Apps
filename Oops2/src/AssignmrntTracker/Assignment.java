package AssignmrntTracker;

public abstract class Assignment {
    public String assignmentName;
    public String assignmentLink;
    public String assignmentPassword;
    public int noOfQuestions;


    public abstract void setAssignmentName(String assignmentName);
    public abstract void setAssignmentLink(String Link);
    public abstract void setAssignmentPassword(String Password);
    public abstract void setNoOfQuestions(int noOfQuestions);
}
