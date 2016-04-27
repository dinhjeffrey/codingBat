/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/

public boolean sameStarChar(String str) {
  int countStars = 0;
  int countSides = 0;
  for (int i=1; i<str.length()-1; i++ ) {
    if (str.substring(i,i+1).equals("*") ) {
      countStars++;
      if (str.substring(i-1, i).equals( str.substring(i+1, i+2) ) )
        countSides++;
    }
  }
    return countSides == countStars;
}