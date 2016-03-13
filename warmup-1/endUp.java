public String endUp(String str) {
  if (str.length() < 3) {
    return str.toUpperCase();
  }
  String upperLast3 = str.substring(str.length()-3).toUpperCase();
  String theRest = str.substring(0,str.length()-3);
  return theRest+upperLast3;
}
