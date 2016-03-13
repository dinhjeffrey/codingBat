public String stringSplosion(String str) {
  String build = "";
  for (int i=1; i<=str.length(); i++){
    build+= str.substring(0,i);
  }
  return build;
}
