public String frontTimes(String str, int n) {
  String copy = "";
  if (str.length() < 3){
    return copy = new String(new char[n]).replace("\0", str);
  }
  String first3 = str.substring(0,3);
  return copy = new String(new char[n]).replace("\0", first3);
}
