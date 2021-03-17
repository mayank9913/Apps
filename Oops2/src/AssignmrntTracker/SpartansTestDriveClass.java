package AssignmrntTracker;

public class SpartansTestDriveClass {
    public static void  main(String[] args){

        SpartansAssignment spartansAssignment = new SpartansAssignment();
        spartansAssignment.setAssignmentName("Hashmaps");
        spartansAssignment.setBatchName("Spartans");
        spartansAssignment.setAssignmentLink("https://www.masai.assignments.oj.com");
        spartansAssignment.setAssignmentPassword("Masai@123");
        spartansAssignment.setNoOfQuestions(5);
        spartansAssignment.diplay();
    }
}
