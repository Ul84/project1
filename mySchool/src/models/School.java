package models;
import java.util.ArrayList;
public class School
{
    private String name;
   private String address;
   private String phoneNumber;
    private ArrayList <Student> students;
    private ArrayList <Teacher> teachers;

    private void intoObject()
    {
        this.students= new ArrayList<Student>();
        this.teachers= new ArrayList<Teacher>();
    }
    /**
     * constructors
     */
    public School()
    {
     this.intoObject();
    }

    public School(String name)
    {
        this.name = name;
        this.intoObject();
    }
    /**
     * setter and getter
     */
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    public ArrayList<Teacher> getTeachers()
    {
        return teachers;
    }

}
