public boolean array123(int[] nums) {
  for (int i=0; i<nums.length -2; i++) { // -1 for each add +1. so +2, so -2..
    if ((nums[i] == 1) && (nums[i+1] == 2) && (nums[i+2] == 3)) {
      return true;
    }
  }
  return false;
}
