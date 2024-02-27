package algorithm_strategies.twopointer;
import java.util.*;

/*
Given an array nums of n integers, and an integer target,
find all unique triplets in the array which gives the sum
of target. Each triplet must be a unique combination of
numbers in the array, and the solution set must not contain
duplicate triplets.

Input: nums = [-1, 0, 1, 2, -1, -4], target = 0
Output: [[-1, -1, 2], [-1, 0, 1]]
Explanation: The triplets sum up to the target value 0.

Two Pointer Approach:
To solve this problem efficiently, we can sort the array and then use the two-pointer technique. We'll iterate through the array, fixing one element at a time, and then use two pointers to find the other two elements such that their sum equals the negative of the fixed element.

Algorithm:
Sort the input array nums.
Iterate through the array:
For each element nums[i], initialize two pointers left = i + 1 and right = nums.length - 1.
While left < right, check if nums[i] + nums[left] + nums[right] equals the target:
If yes, add [nums[i], nums[left], nums[right]] to the result set.
Increment left and decrement right.
Skip duplicate elements to avoid duplicate triplets.
Return the result set.
Java Solution:

Complexity Analysis:
Time Complexity: O(N^2), where N is the number of elements in the array. Sorting takes O(N log N) time, and the two-pointer approach takes O(N) time.
Space Complexity: O(N), for storing the result set.





*/
public class ThreeSum {



    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate elements
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++; // Skip duplicate elements
                    while (left < right && nums[right] == nums[right + 1]) right--; // Skip duplicate elements
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }




}
