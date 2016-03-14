public int last2(String str) {  
  int count = 0;
  if (str.length() < 2){
    return 0;
  }
  String back2 = str.substring(str.length()-2);
  for (int i=0; i<str.length()-2; i++){
    if (str.substring(i, i+2).equals(back2)){
      count++;
    }
  }
  return count;
}


// == tests if they are the same object

// .equals() tests for value equality

// http://www.tutorialspoint.com/compile_java_online.php