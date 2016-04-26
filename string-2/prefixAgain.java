/* prefixAgain
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
*/

public boolean prefixAgain(String str, int n) { //abXYabc , 2
  String capture = str.substring(0, n); // ab
  for (int i=n; i<str.length()-n+1; i++ ) {  // XYabc  
    if ( (str.substring(i, i+n) ).equals (capture) ) // use .equals() for strings. == doesn't work
      return true;
  }
  return false;
}