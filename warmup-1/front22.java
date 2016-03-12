public String front22(String str) {
  if (str.length() <2) {
    return str+str+str;
  }
  String first2 = str.substring(0,2);
  return first2+str+first2;
}
