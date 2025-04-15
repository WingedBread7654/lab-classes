
/**
 * Write a description of class Instructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor
{
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    /**
     * Constructor for objects of class Instructor
     */
    public void Instructor(String fullName, String InstructorID)
    {
        name = fullName;
        id = InstructorID;
        credits = 0;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getInstructorID()
    {
        return id;
    }

       /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", Instructor ID: " + id);
    }

}
