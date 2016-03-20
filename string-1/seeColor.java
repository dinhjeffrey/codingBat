public String seeColor(String str) {
  if (str.length() < 3)
    return "";
  if (str.substring(0,3).equals("red") )
    return "red";
  // order of str.length and str.substring matters for the line below
  if (str.length() >3 && str.substring(0,4).equals("blue") )
    return "blue";
  return "";
}
