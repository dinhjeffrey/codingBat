public String stringTimes(String str, int n) {
  String str2 = new String(new char[n]).replace("\0", str);
  return str2;
}
