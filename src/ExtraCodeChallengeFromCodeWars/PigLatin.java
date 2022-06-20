package ExtraCodeChallengeFromCodeWars;

import java.util.ArrayList;
import java.util.LinkedList;

public class PigLatin {
    public static void main(String[] args) {
        pigIt("Pig latin is cool");

    }

    public PigLatin() {
    }

    public static String pigIt(String str) {
        String ss = new String();
        // Write code here
        for(int i=0; i < str.length(); i++) {
            Boolean pig = Character.isAlphabetic(str.charAt(i));
            if(pig) {
                String[] word = str.split(" ");
                for (int j=0;j < word.length; j++) {
                  /*char[] c = word[j].toCharArray();
                    for (int x=1; x< c.length; x++){
                        temp = c[x]+c[0]+"ay";
                    }*/
                    ss=word[j].substring(1) + word[j].substring(0, 1) + "ay ";
                }

            }
        }

        return ss;
    }
}
