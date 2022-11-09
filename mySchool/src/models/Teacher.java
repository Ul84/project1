package models;

public class Teacher extends Person
{
    private double salary;

    /**
     * constructors
     */
    public Teacher()
    {
     //just for not confuse me
    }
    public Teacher(String name, int age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }

    @Override
    //Have Abstract From Person Class
    public String getData()
    {
        return "\nName: "+this.getName()+"\nAge= "+this.getAge()+"\nSalary= "+this.getSalary()+"\n";
    }

    /**
     * setter and getter
     * @return
     */
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}

