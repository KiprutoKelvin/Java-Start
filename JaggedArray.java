// public class JaggedArray {

//     public static void main(String[] args) {
//         int nums[][] = new int[3][]; //Jagged
//        // int nums[][][] = new int[3][4][5]; //Three dimesional Arrary

//         nums[0] = new int[3];
//         nums[1] = new int[4];
//         nums[2] = new int[2];

//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums[i].length;j++)
//             {
//                 nums[i][j] = (int)(Math.random() *10);
//             }
//         }

//         for(int n[] : nums)
//         {
//             for(int m: n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();

//         }
//     }
// }


// Arrays of Objects
class Student
{
    int rollno;
    String name;
    int marks;
}

public class JaggedArray {

    public static void main(String[] args) 
    {
        
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

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        // int nums[] = new int[4];

        // nums[0] = 4;
        // nums[1] = 6;
        // nums[2] = 8;
        // nums[3] = 7;

        // for(int i=0;i<nums.length;i++) //i<7 -Exception error
        // {
        //     System.out.println(nums[i]);
        // }
    }
}

