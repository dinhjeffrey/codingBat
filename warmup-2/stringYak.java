public String stringYak(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
  // Look for i starting a "y" + anything + "k" -- advance i + 2 in that case. 
  // checks if at the end of string length as well
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i += 2;
    } else { // Otherwise do the normal append
      result += str.charAt(i); 
    }
  }
  return result;
}