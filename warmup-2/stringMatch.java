public int stringMatch(String a, String b) {
  int count = 0;
  for (int i=0; i<a.length()-1; i++){
    for (int j=0; j<b.length()-1; j++){
      if (a.substring(i,i+2).equals(b.substring(j,j+2)) && i == j){ // appears in the same position i && j
        count++;
      }
    }
  }
  return count;
}
