public class main {
    /*
    public static void main(String[] args){
        String s = "1100";
        Boolean b = DFA(s.toCharArray());
        System.out.println(b.toString());
    }
    */

    /**
    DFA
     Method to simulate the DFA for finding if a number is divisible by 3 and 4 at the same time.
     */
    public static Boolean DFA(char[] word){
        int state = 0;
        for(char c:word){
            switch(state){
                case (0): {
                    if (c == '0'){
                        state = 0;
                    }
                    else if (c == '1'){
                        state = 3;
                    }
                }
                break;
                case (1): {
                    if (c == '0'){
                        state = 0;
                    }
                    else if (c == '1'){
                        state = 3;
                    }
                }
                break;
                case (2): {
                    if (c == '0'){
                        state = 1;
                    }
                    else if (c == '1'){
                        state = 3;
                    }
                }
                break;
                case (3): {
                    if (c == '0'){
                        state = 4;
                    }
                    else if (c == '1'){
                        state = 2;
                    }
                }
                break;
                case (4): {
                    if (c == '0'){
                        state = 3;
                    }
                    else if (c == '1'){
                        state = 4;
                    }
                }
                break;
            }
        }
        if (state == 0){
            return true;
        }
        else return false;
    }
}
