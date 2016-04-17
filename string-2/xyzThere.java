/* xyzThere
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/

public boolean xyzThere(String str) {
  if (str.length() <3)
    return false;
  int count=0;
  for (int i=0; i<str.length() -2; i++ ){ // asdxyz
    if (str.substring(i, i+3).equals("xyz") ) {
      count++;
    }
  }
  int countWithPeriod = 0;
  for (int i=0; i<str.length() -3; i++ ){ // asdxyz
    if (str.substring(i, i+4).equals(".xyz") ) {
      countWithPeriod++;
    }
  }
  if (count==countWithPeriod && count > 0)
    return false;
  if (count > countWithPeriod )
    return true;
  return false;
}