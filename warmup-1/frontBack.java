public String frontBack(String str) {

  if (str.length() <= 1) {
    return str;
  }
  if (str.length() == 2) {
    return str.substring(str.length() - 1) + str.substring(0,1);
  }
  String first = str.substring(0,1);
  String middle = str.substring(1,str.length()-1);
  String last = str.substring(str.length()-1);
  return last+middle+first;
  
}
