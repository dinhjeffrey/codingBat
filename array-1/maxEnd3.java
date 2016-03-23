/* maxEnd3
Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array. 

maxEnd3({1, 2, 3}) → {3, 3, 3}
maxEnd3({11, 5, 9}) → {11, 11, 11}
maxEnd3({2, 11, 3}) → {3, 3, 3}
*/

public int[] maxEnd3(int[] nums) {
  int[] first = { nums[0], nums[0], nums[0] };
  int[] last = { nums[2], nums[2], nums[2] };
  if (nums[0] > nums[2])
    return first;
  return last;
}