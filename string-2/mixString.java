// re-factor to not use breaks
/* mixString
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
  String newString ="";
  int lastIndex = 0;
  
    for (int i=0; i<a.length(); i++ ) {
      newString+= a.charAt(i);
      for (int j=i; j<b.length(); j++ ) {
        newString+= b.charAt(j);
        lastIndex++;
        break;
      }
    }
    if (b.length() > a.length() ) {
      for (int k=lastIndex; k<b.length(); k++ ) {
        newString+= b.charAt(k);
      }
    } 
  return newString;
}
