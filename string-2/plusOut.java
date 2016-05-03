/*  plusOut
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

public String plusOut(String str, String word) {
  StringBuilder newStr = new StringBuilder(str); // "12xy34", "xy"
  String addToEnd = new String(new char[word.length()]).replace("\0", "+"); // adds extra + at the end equal to word length and removes it later to account for some ending problems
  newStr.insert(newStr.length(), addToEnd );
  for (int i=0; i<newStr.length()-word.length()+1 ; i++ ) { // 6-2+1 = 5
    if (newStr.substring(i, i+word.length() ).equals(word ) ) // 4, 6
      i+=word.length() -1; // i = 4+2-1 = 5 -->6
    else 
      newStr.replace(i, i+1, "+" ); // stops too early, since we only check to newStr.length() - word.length() + 1
  }
    newStr.delete(newStr.length()-word.length(), newStr.length() );
  return newStr.toString();
}