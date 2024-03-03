package algorithm_strategies.twopointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int val = 3;

        int[] rult = new int[nums.length];

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {

                rult[j] = nums[i];
                j++;
            }
        }

        System.out.println(j);
        System.out.println(Arrays.toString(rult));


    }
}
