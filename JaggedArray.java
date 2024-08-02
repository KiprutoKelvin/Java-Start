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
public class JaggedArray {

    public static void main(String[] args) {
        int nums[] = new int[6];

        nums[0] = 4;
        nums[1] = 6;
        nums[2] = 8;
        nums[3] = 7;

        for(int i=0;i<6;i++)
        {
            System.out.println(nums[i]);
        }
    }
}

