/* zipZap
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
*/

public String zipZap(String str) {
  String newString = "";
  int placeholder = 0;
  if (str.length() == 0)
    return "";
  if (str.substring(0,1).equals("z") && str.length()<3 )
    return str;
  for (int i=0; i<str.length()-2; i++ ){
    if (str.substring(i, i+1).equals("z") && str.substring(i+2, i+3).equals("p") ) {
      newString += str.substring(placeholder, i) + str.substring(i, i+1) + str.substring(i+2, i+3);
      placeholder = i+3;
    }
  }
  if (placeholder == 0)
    return str;
  return newString;
}