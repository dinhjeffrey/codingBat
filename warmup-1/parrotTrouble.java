public boolean parrotTrouble(boolean talking, int hour) {
// talking is true or false
// hour is 0 - 23
// return true if talking is true and  hour < 7 and hour >20
  if ((talking == true && hour < 7) || (talking == true && hour > 20)){
    return true;
  } else {
    return false;
  }

  
}
