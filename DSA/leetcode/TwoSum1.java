import java.util.Scanner;
class TwoSum1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("enter your array size here:");
        int size = scanner.nextInt();
        int[] nums = new int [size]; 

        System.out.print("enter your target value:");
        int target = scanner.nextInt();
        // System.out.print(target);

        System.out.print("enter your arr here:");
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = scanner.nextInt();
        }
        // System.out.print(nums);

        for(int i = 0 ; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target)
                {
                   System.out.print("indices valuse"+i+" " +j);
                }
            }

        }
         scanner.close();
    
    }
}

// class main {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] == target - nums[i]) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         // In case there is no solution, we'll just return null
//         return null;
//     }
// }

//second solution 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }