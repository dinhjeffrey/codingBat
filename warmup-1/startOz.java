public String startOz(String str) {
  if (str.length() < 2){
    return str;
  }
  if (str.substring(0,1).equals("o") && str.substring(1,2).equals("z")){
    return "oz";
  }
  if (str.substring(0,1).equals("o")){
    return "o";
  }
  if (str.substring(1,2).equals("z")){
    return "z";
  }
  return "";
}