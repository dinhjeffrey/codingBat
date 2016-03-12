public int diff21(int n) {
// absolute difference is always positive. n - 21
// if n is over 21, double the number
  int answer = n-21;
  if (n > 21){
    answer *= 2;
  }
  if (answer < 0) {
    return answer *= -1;
  } else {
    return answer;
  }
    
}