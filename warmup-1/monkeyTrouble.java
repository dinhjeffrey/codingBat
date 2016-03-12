public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

// we are in trouble if both are smiling, or if neither are smiling. return true if in trouble

// return false if one is smiling, and the other is not smiling
  if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
    return true;
  } else {
    return false;
  }
  
  
}
