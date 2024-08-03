/**
 * EnhancedLoop
 */

 class Student
{
    int rollno;
    String name;
    int marks;
}

public class EnhancedLoop {

    public static void main(String[] args) {
        // int nums[] = new int[4];

        // nums[0] = 4;
        // nums[1] = 6;
        // nums[2] = 8;
        // nums[3] = 7;

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Kipruto";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 1;
        s2.name = "Kiptogom";
        s2.marks = 62;

        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Kipsegenen";
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}