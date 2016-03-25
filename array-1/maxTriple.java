/* maxTriple
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1. 

maxTriple({1, 2, 3}) → 3
maxTriple({1, 5, 3}) → 5
maxTriple({5, 2, 3}) → 5
*/

public int maxTriple(int[] nums) {
  int half = nums.length /2;
  if (nums.length == 1)
    return nums[0] ;
  if (nums[0] > nums[half] && nums[0] > nums[nums.length-1])
    return nums[0];
  if (nums[half] > nums[nums.length-1])
    return nums[half];
  return nums[nums.length-1];
}