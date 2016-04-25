/* xyzMiddle
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/

public boolean xyzMiddle(String str) {
  int indexXYZ = str.indexOf("xyz");
  int lastIndexXYZ = str.lastIndexOf("xyz"); // 7 3 6 = 16
  if (indexXYZ == -1)
    return false;
  if (indexXYZ != lastIndexXYZ) {
    int indexHalf = (str.length() / 2) -2;
    indexXYZ = str.indexOf("xyz", indexHalf);
  }
  int leftLength = str.substring(0, indexXYZ).length();
  int rightLength = str.substring(indexXYZ+3).length();
  return (leftLength == rightLength || leftLength == rightLength-1 || leftLength == rightLength+1 );
}