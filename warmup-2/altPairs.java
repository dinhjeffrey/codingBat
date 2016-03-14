public String altPairs(String str) {
  if (str.length() <1) {
    return "";
  }
  if (str.length() <2) {
    return str;
  }
  String ans = "";
  for (int i=0; i<str.length(); i+=4){ // 9 index is 8
    if (i == str.length()-1) { // so you gotta minus 1 to get length == index
      ans+= str.substring(str.length()-1);
    } else {
    ans+= str.substring(i,i+2);
    }
  }
  return ans;
}