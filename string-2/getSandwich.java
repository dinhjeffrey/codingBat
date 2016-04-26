/* getSandwich
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/

public String getSandwich(String str) {
  if (str.indexOf("bread") != str.lastIndexOf("bread") ) {
     int firstIndex = str.indexOf("bread");
    return str.substring(firstIndex + 5, str.lastIndexOf("bread") );
  }
  return "";
}