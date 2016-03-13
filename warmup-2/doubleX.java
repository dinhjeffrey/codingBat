boolean doubleX(String str) {
  for (int i=0; i<str.length(); i++){
    if (str.charAt(i) == 'x' && i+1 < str.length()) {
      if (str.charAt(i+1) == 'x') {
        return true;
      }
      return false;
    }
  }
  return false; // need this line because need a code to run incase of fail
}
