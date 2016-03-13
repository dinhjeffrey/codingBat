public int close10(int a, int b) {
  int spaceA = Math.abs(10 - a);
  int spaceB = Math.abs(10 - b);
  if (spaceA == spaceB){
    return 0;
  }
  if (spaceA > spaceB){
    return b;
  }
  return a;
}
