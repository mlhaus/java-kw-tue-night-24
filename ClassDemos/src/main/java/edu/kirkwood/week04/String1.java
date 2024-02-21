package edu.kirkwood.week04;

public class String1 {

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * @param name A person's name as a string
     * @return A string greeting
     */
    public String helloName(String name) {
        return String.format("Hello %s!", name);
    }


    /**
     * @param out a string length 4, such as "<<>>"
     * @param word - a string
     * @return a new string where the word is in the middle of the out string, e.g. "<<word>>"
     */
    public String makeOutWord(String out, String word) {
        String out1 = out.substring(0, 2); // return first 2 chars
        String out2 = out.substring(2); // returns from char at index 2 to end
        return out1 + word + out2;
    }


    /**
     * @param str a string of even length
     * @return the first half. So the string "WooHoo" yields "Woo"
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * @param a a String at least length 1.
     * @param b a String at least length 1.
     * @return a concatenated to b, except omit the first char of each.
     */
    public String nonStart(String a, String b) {
        a = a.substring(1); // omit the first character
        b = b.substring(1);
        return a.concat(b);
    }


    /**
     * @param str A non-empty string.
     * @param front a boolean.
     * @return a string length 1 from its front, unless front is false,
     * in which case return a string length 1 from its back.
     */
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);

  /*
  if(front) {
    return str.charAt(0) + "";
    // return str.substring(0, 1);
  } else {
    return str.charAt(str.length() - 1) + "";
    // return str.substring(str.length() - 1);
  }
  */
    }

    /**
     * @param str a String
     * @return true if it ends in "ly"
     */
    public boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");

  /*
  if(str.length() < 2) {
    return false;
  }
  String lastTwo = str.substring(str.length() - 2);
  return lastTwo.equals("ly");
  */
    }

    /**
     * @param str a string of odd length. The string length will be at least 3.
     * @return return the string length 3 from its middle, so "Candy" yields "and".
     */
    public String middleThree(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 2);
    }

    public String lastTwo(String str) {
        if(str.length() < 2) {
            return str;
        }
        String lastLetter = str.substring(str.length() - 1);
        String secondToLastLetter = str.substring(str.length() - 2, str.length() - 1);
        return str.substring(0, str.length() - 2) + lastLetter + secondToLastLetter;
    }

    public String withoutX2(String str) {
        if(str.length() < 2 && str.indexOf("x") < 0) {
            return str;
        }
        if(str.substring(0, 2).equals("xx")) {
            return str.substring(2);
        }
        if(str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }
        if(str.charAt(0) == 'x') {
            return str.substring(1);
        }
        return str;
    }
    
}
