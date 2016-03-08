public boolean sleepIn(boolean weekday, boolean vacation) {
// 1st parameter true means it is the weekday
// 2nd paramenter true means we are on vacation
	if (weekday == false) { //weekend, always sleepIn
  		return true;
	} else if (weekday == true && vacation == true) { // weekday and vacation
  		return true;
	} else {
  		return false;
	}
}