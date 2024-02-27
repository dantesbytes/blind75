package leetcode75.arraysandstrings;

import java.util.Arrays;

public class MergeStringsAlternately {

    public static void main(String[] args) {


        int[] nums = {3,2,1,5,10,9,8,0,6,4};

        for (int i = 1; i < nums.length; i++) {


            int tmp = nums[i];
            int j = i;

            // nums[0] = 3 > nums[1] = 2
            while(j > 0 && nums[j-1] > nums[j]){ // j == 1


                nums[j] = nums[j-1];
                nums[j-1] = tmp;
                j--;
            }


            nums[j] = tmp;



        }

        System.out.println(Arrays.toString(nums));

    }

}
