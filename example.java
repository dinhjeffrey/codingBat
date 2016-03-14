public class HelloWorld{

  public static void main(String []args){
    System.out.println("Hello World");
    HelloWorld poop = new HelloWorld();
    System.out.println(poop.last2("hixxhi"));
  }
     
  public String last2(String str) {  
    int count = 0;
    if (str.length() < 2){

    }
  String back2 = str.substring(str.length()-2);
    for (int i=0; i<str.length()-2; i++){
      if ((str.substring(i, i+2) == back2)){
      count++;
      }
    }
  return back2;
  }
}

// http://www.tutorialspoint.com/compile_java_online.php