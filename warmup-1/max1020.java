public int max1020(int a, int b) {
  if ((a<10 || a>20) && (b<10 || b>20)){
    return 0;
  }
  if ((a>=10 && a<=20) && (b>=10 && b<=20) && (a>b)){
    return a;
  }
  if ((a>=10 && a<=20) && (b>=10 && b<=20) && (b>a)){
    return b;
  }
  if (a>=10 && a<=20){
    return a;
  }
  return b;
}