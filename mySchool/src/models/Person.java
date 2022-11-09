package models;

public abstract class Person
{
    String name;
    int age;

    /**
     * constructors
     */
    public Person()
    {
        //just for not confuse me
    }
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    /**
     * setter and getter
     */
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract String getData();
}
