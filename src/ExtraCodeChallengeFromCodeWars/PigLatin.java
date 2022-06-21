package ExtraCodeChallengeFromCodeWars;

import java.util.ArrayList;
import java.util.LinkedList;

public class PigLatin {
    public static void main(String[] args) {
        pigIt("Pig latin is cool !");

    }
    public static String pigIt(String str) {
        String strs = "";Boolean pig = null;
        String [] word = str.split(" ");
        String [] newWord = new String[word.length];
        for(int i=0; i < str.length(); i++) {
            pig = Character.isAlphabetic(str.charAt(i));
        }
            if (pig){
                for(int l=0; l<word.length;l++){
                    newWord[l]=word[l].substring(1)+word[l].substring(0,1)+"ay";
                }
                for(int j= 0; j<newWord.length -1; j++){
                    strs += newWord[j]+" ";
                }
                strs+=newWord[newWord.length-1];
            }else{
                newWord = new String[word.length-1];
                for(int l=0; l<word.length-1;l++){
                    newWord[l]=word[l].substring(1)+word[l].substring(0,1)+"ay";
                }
                for(int j= 0; j<newWord.length; j++){
                    strs += newWord[j]+" ";
                }
                strs+=word[word.length-1];
            }


        return strs;
    }
}

/*
public class PigLatin {
    public static String pigIt(String str) {
      String strs = "";
      String [] word = str.split(" ");
      String [] newWord = new String[word.length];

      for(int i=0; i<word.length;i++){
          newWord[i]=word[i].substring(1)+word[i].substring(0,1)+"ay";
      }
      for(int j= 0; j<newWord.length -1; j++){
                strs += newWord[j]+" ";
      }
        strs+=newWord[newWord.length-1];
        return strs;
    }



}*/
