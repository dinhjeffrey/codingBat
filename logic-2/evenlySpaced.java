/* evenlySpaced
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
  int small;
  int medium;
  int large;
  if (a<=b && a<=c && b<=c) {
     small = a;
     medium = b;
     large = c;
  }
  else if (a<=b && a<=c && c<=b) {
     small = a;
     medium = c;
     large = b;
  }
  else if (b<=a && b<=c && a<=c) {
     small= b;
     medium = a;
     large = c;
  }
  else if (b<=a && b<=c && c<=a) {
     small= b;
     medium = c;
     large = a;
  }
  else if (c<=a && c<=b && a<=b) {
     small= c;
     medium = a;
     large = b;
  }
  else  {
     small= c;
     medium = b;
     large = a;
  }
  return large-medium == medium-small;
}