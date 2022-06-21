package ExtraCodeChallengeFromCodeWars;

public class ExpressionsMatter {
    /*Not finished yet*/
    public static void main(String[] args) {
        expressionsMatter(1,2,3);
    }

    public static int expressionsMatter(int a, int b, int c){
        int result =0;
        int com1 = a * ( b + c);
        int com2 = a * b * c;
        int com3 = a + b * c;
        int com4 = (a + b) * c;
        if(com1 >com2 && com1>com3 && com1>com4){
            result = com1;
        }else if(com2 >com1 && com2>com3 && com2>com4){
           result = com2;
        }else if(com3 >com1 && com3>com2 && com3>com4){
            result = com3;
        }else if(com4 >com1 && com4>com2 && com4>com3){
            result = com4;
        }
        return result;
    }

}
