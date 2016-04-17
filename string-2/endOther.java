/* endOther
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public boolean endOther(String a, String b) {
  if (a.length()<=b.length() )
    return a.toLowerCase().equals(b.substring(b.length()-a.length()).toLowerCase() );
  return (b.toLowerCase().equals(a.substring(a.length()-b.length()).toLowerCase() ) );
}