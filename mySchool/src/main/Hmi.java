package main;
import Tools.Actions;
import models.*;
import services.SchoolMethod;
import java.util.Scanner;
public class Hmi
{
    private static SchoolMethod schoolMethod;

 public static void Start()
 {
     Scanner input=new Scanner(System.in);
     int action;

     School school = Hmi.createSchool();
     SchoolMethod schoolMethod=new SchoolMethod(school);

     System.out.println("Welcome to "+school.getName()+ " in "+school.getAddress());
     do
     {
         System.out.println("What do you want to do?");
         System.out.println("1-Student"+"   "+"2-Teacher"+"     "+"0-Exit");
         action=input.nextInt();

          //action whit user
         switch (action)
         {
             //Student
             case 1:
             {
                 System.out.println("1-addStudent"+"    "+"2-removeStudent"+"     "+"3-findStudentByName"+"     "+"4-printAllStudents");
                 action=input.nextInt();
                 switch (action)
                 {
                     //Student using
                     case 1:Hmi.addStudent();break;
                     case 2:Hmi.removePerson(Actions.STUDENT);break;
                     case 3:Hmi.printDataPersonByName(Actions.STUDENT);break;
                     case 4:Hmi.printAllStudents();break;

                 }
             }
             //Teacher
             case 2:
             {
                 System.out.println("1-addTeacher"+"    "+"2-removeTeacher"+"     "+"3-findTeacherByName"+"     "+"4-printAllTeachers");
                 action=input.nextInt();
                 switch (action)
                 {
                     //Teacher using
                  case 1:Hmi.addTeacher();break;
                  case 2:Hmi.removePerson(Actions.TEACHER);break;
                  case 3:Hmi.printDataPersonByName(Actions.TEACHER);break;
                  case 4:Hmi.printAllTeacher();break;
                 }
             }
         }
     } while (action!=0);
 }


 //case the user want to create new School info
 private static School createSchool()
 {
     School school =new School();
     Hmi.schoolMethod =new SchoolMethod(school);
     Scanner input=new Scanner(System.in);

     System.out.println("enter the Name of the School");
     school.setName(input.nextLine());

     System.out.println("enter the address of the School");
     school.setAddress(input.nextLine());

     System.out.println("enter the Phone Number of the School");
     school.setPhoneNumber(input.next());
     return school;
 }
    //case the user want to add new student to the school
 private static void addStudent()
 {
     Student student = new Student();
     //polymorphism
     Hmi.setDataPerson(student);
     //add the data to school (Static)
     Hmi.schoolMethod.addNewStudent(student);
 }
    public static void printAllStudents()
    {
        for (Student student:Hmi.schoolMethod.getSchool().getStudents())
        {
            //toString
            System.out.println(student.getData());
        }

    }
    private static void addTeacher()
    {
        Teacher teacher = new Teacher();
        //polymorphism
         Hmi.setDataPerson(teacher);
        //add the data to school (Static)
        Hmi.schoolMethod.addNewTeacher(teacher);
    }

    public static void printAllTeacher()
    {
        for (Teacher teacher:Hmi.schoolMethod.getSchool().getTeachers())
        {
            //toString
            System.out.println(teacher.getData());
        }

    }
    private static void setDataPerson(Person p)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("please enter the name");
        p.setName(input.next());
        System.out.println("please enter the Age");
         p.setAge(input.nextInt());

        //if it was Teacher you need set salary
        if (p instanceof Teacher)
        {
            System.out.println("please enter the salary");
            ((Teacher) p).setSalary(input.nextDouble());


        }
        //else if was Student you need set Parents Phone Number
        else if (p instanceof Student)
        {
            System.out.println("please enter the Parents Phone Number");
            ((Student) p).setParentPhoneNumber(input.next());
        }

    }
    //this method use just for clean the code using findPersonByName method
    private static void printDataPersonByName(Actions action)
    {
        Person p=Hmi.findPersonByName(action);
        Hmi.printDataPerson(p);
    }
    private static void printDataPerson(Person p)
    {
        if (p==null)
        {
            System.out.println("Not Find!");
        }
        else
        {
            System.out.println(p.getData());
        }
    }

    //search for Person by his name
    private static Person findPersonByName(Actions action)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the name");
        Person p;
        String name= input.next();
        if (action==Actions.STUDENT)
        {
            p = Hmi.schoolMethod.getStudentByName(name);
        }
        else
        {
            p = Hmi.schoolMethod.getTeacherByName(name);
        }
        return p;
    }

    //to remove person
    private static void removePerson(Actions action)
    {
        //use Find method in this method to Find the Right person to remove
         Person p=Hmi.findPersonByName(action);

         //if the (P) is a Student
        if (p instanceof Student)
        {
            //casting
            Hmi.schoolMethod.removeStudent((Student) p);
        }

        //else (P) is a Teacher
        else
        {
            //casting
            Hmi.schoolMethod.removeTeacher((Teacher) p);
        }

    }

}





