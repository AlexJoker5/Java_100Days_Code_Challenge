package Day11;

import java.util.Arrays;

public class BreakLabel {
    public static void main(String[] args) {

        String paragraph = """
                I have a dream
                That's all I need
                I'll make it happen with some work and belief
                Know what I want
                So I'll take it on
                I've made mistakes but mistakes make you strong
                Let's break it down for a minute
                I want the crown, I'ma gonna get it
                You hear me loud man I'm winning
                Yea Charley Sheen would be grinning
                These ladies know that I'm sinning
                And this is just the beginning
                I'm closing in the 9th inning
                There ain't no point in resisting
                """;

        String [] result = searchIndex(paragraph,"in");

        for(String str : result){
            System.out.println(str);
        }

    }

    static String [] searchIndex(String paragraph, String keyword){

        String [] lines = paragraph.split("\n");
        String [] result = {};
        int lineNo = -1;

        outer: //label in java.
        /*It's bad practice to use label in programming.
        * Loop of line from a paragraph.*/
        for (int i =0; i < lines.length; i++){

            String [] words = lines[i].split(" ");

            //loop of word from a line.
            for (int j = 0; j < words.length; j++){

                String word = words[j].replaceAll("\\.", "")
                        .replaceAll(",","");


                // Found keyword
                if (word.equals(keyword)){
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length-1] = "Found At Line " + (i + 1) + ", Word " + (j + 1) +".";
                    continue outer;
                }
            }
        }

        return result;
    }
}
