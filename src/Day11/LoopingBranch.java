package Day11;

public class LoopingBranch {

    public static void main(String[] args) {

        if(args.length == 2){
            // first arg (total count)
            int total = Integer.parseInt(args[0]);

            // first arg (total count)
            int show = Integer.parseInt(args[1]);

            if(total <= show){
                System.out.println("Total must greater than show count.");
                //stop the rest of codes in the same code block.
                return;
            }

            for (int i = 1; i <= total; i++){
                if (i%2==1){
                    //skip current loop.
                    continue;
                }
                System.out.println(i);
                if (i >=show){
                    //stop and skip rest of the loop
                    break;
                }
            }
        } else {
            System.out.println("Please enter total and show count parameter.");
        }
    }

}
