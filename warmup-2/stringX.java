public String stringX(String str) {
  if (str.length()<1){
    return "";
  }
  if (str.length()==1){
    return str;
  }
  if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x") ) {
    return "x" + str.replace("x", "") + "x";
  }
  if (str.substring(0,1).equals("x") ) {
    return "x" + str.replace("x", "");
  }
  if (str.substring(str.length()-1).equals("x") ) {
    return str.replace("x","") + "x";
  }
  return str.replace("x","");
}