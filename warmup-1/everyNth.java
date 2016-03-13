public String everyNth(String str, int n) {
  String make = "";
  
  for (int i=0; i<str.length(); i+=n ){
    make+= str.substring(i, i+1);
  }
  return make;
}
