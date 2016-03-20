public String startWord(String str, String word) {
  if (word.length()>str.length() )
    return "";
  int count=0;
  for (int i=0; i<word.length(); i++) {
    if (word.substring(i,i+1).equals(str.substring(i,i+1)) )
      count++;
  }
  if ((count == word.length()-1 )|| (word.length()==2 && count == word.length()) || (word.substring(0,1).equals(str.substring(0,1)) && count == word.length() ) )   
    return str.substring(0, word.length());
  return "";
}
