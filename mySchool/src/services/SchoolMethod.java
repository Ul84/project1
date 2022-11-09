package services;
import models.School;
import models.Student;
import models.Teacher;
import java.util.Locale;
public class SchoolMethod
{
    private School  school;

    /**
     * constructor to create new school
     * @param school
     */
    public SchoolMethod(School school)
    {
        this.school = school;
    }

    /**
     * getter
     * @return
     */
    public School getSchool()
    {
        return school;
    }

    /**
     * add student to the arrayList of student
     * @param student
     */
    public void addNewStudent(Student student)
    {
        this.school.getStudents().add(student);
    }
    /**
     * add teacher to the arrayList of Teacher
     */
    public void addNewTeacher(Teacher teacher)
    {
        this.school.getTeachers().add(teacher);
    }

    /**
     * remove student from the arrayList of Student
     */
    public void removeStudent(Student student)
    {
        this.school.getStudents().remove(student);
    }
    /**
     * remove teacher from the arrayList of Teacher
     */
    public void removeTeacher(Teacher teacher)
    {
        this.school.getTeachers().remove(teacher);
    }/**


    /**
     * search for student by his name from the arrayList
     * @param name
     * @return
     */
   public Student getStudentByName(String name)
   {
       for (Student student :this.school.getStudents())
       {
          if (student.getName().toUpperCase(Locale.ROOT).equals(name.toUpperCase(Locale.ROOT)))
          {
             return student;
          }
       }
       return null;
   }
    /**
     * search for Teacher by his name from the arrayList
     * @param name
     * @return
     */
    public Teacher getTeacherByName(String name)
    {
        for (Teacher teacher :this.school.getTeachers())
        {     //trans the getName and the userInput to upperCase to search whit any cases
            if (teacher.getName().toUpperCase(Locale.ROOT).equals(name.toUpperCase(Locale.ROOT)))
            {
                return teacher;
            }
        }
        return null;
    }

}
