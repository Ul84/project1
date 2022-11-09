package models;

public class Student extends Person
{
   private String parentPhoneNumber;

    /**
     * constructors
     */

    public Student()
    {
        //just for not confuse me
    }

    @Override
    //Have Abstract From Person Class
    public String getData()
    {
        return "\nName: "+this.getName()+"\nAge= "+this.getAge()+"\nParent Phone Number: "+this.getParentPhoneNumber()+"\n";
    }
    //constructor
    public Student(String name, int age, String parentPhoneNumber)
    {
        super(name, age);
        this.parentPhoneNumber = parentPhoneNumber;
    }

    /**
     * setter and getter
     * @return
     */
    public String getParentPhoneNumber()
    {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber)
    {
        this.parentPhoneNumber = parentPhoneNumber;
    }
}
