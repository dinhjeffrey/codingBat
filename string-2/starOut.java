/* starOut
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/

public String starOut(String str) { // ab**cd
  StringBuilder newStr = new StringBuilder(str);
  int placeholder = 0;
  int j = 0;
  if (newStr.length() == 0)
    return "";
  if (newStr.length() < 3 && newStr.indexOf("*") != -1 )
    return "";
  if (newStr.substring(0, 1).equals("*") ) {
    newStr.delete(0, 2);
    j=2;
  }
  if (newStr.substring(newStr.length()-1 ).equals("*") )
    newStr.delete(newStr.length()-2, newStr.length() );
  for (int i = j; i<newStr.length(); i++ ) { // 0-5
    if (newStr.substring(i, i+1).equals("*") ) { // 2, 3
      if (newStr.substring(i+1, i+2).equals("*") ) { // yes
         newStr.delete(i, i+1); // ab*cd
         i--;
      } else {
        newStr.delete(i-1, i+2);
        if (newStr.length() > 4 )
          i-=3;
      }
    }
  }
  return newStr.toString();
}