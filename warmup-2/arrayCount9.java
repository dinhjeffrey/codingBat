public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length; i++){ // use .length not .length() to get length of arr
    if (nums[i] == 9){ // use == not .equals for arrays?
      count++;
    }
  }
  return count;
}
