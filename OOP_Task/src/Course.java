public class Course {

    String course;
    String instructor;
    int numberOfStudents;

    Course(String courseName, String instructorName, int numberOfStudentsEnrolled){
        course = courseName;
        instructor = instructorName;
        numberOfStudents = numberOfStudentsEnrolled;
    }

    public void setCourse(String newCourse){
        course = newCourse;
    }

    public String getCourse(){
        return course;
    }
    
    public void setIstructor(String newInstructor){
        instructor = newInstructor;
    }

    public String getInstructor(){
        return instructor;
    }
    public void setNumberOfStudents(int newNumberOfStudents){
        numberOfStudents = newNumberOfStudents;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    @Override
    public String toString(){
        return "Course Name: " + course + ", Instructor Name: " + instructor + " Number of Students: " + numberOfStudents;

    }
    public static void main(String[] args) throws Exception {
        Course java = new Course("Java", "Salwa", 20);
        
        System.out.println(java.toString());
        

    }
}
