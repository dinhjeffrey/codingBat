public String stringBits(String str) {
  String build = "";
  for (int i=0; i<str.length(); i+=2){
    build+= str.substring(i,i+1);
  }
  return build;
}
