public String deFront(String str) {    
  String result = "";
  if (str.substring(0,1).equals("a") )
    result+="a";
  if (str.substring(1,2).equals("b") )
    result+="b";
  return result+=str.substring(2);
}
