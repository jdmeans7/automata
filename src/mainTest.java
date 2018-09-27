import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @org.junit.jupiter.api.Test
    void DFATrueTests() {
        String s = "11000";
        String d = "1100";
        String f = "100100";
        String g = "110000";
        String h = "10010110000";
        Assertions.assertEquals(main.DFA(s.toCharArray()), true);
        Assertions.assertEquals(main.DFA(d.toCharArray()), true);
        Assertions.assertEquals(main.DFA(f.toCharArray()), true);
        Assertions.assertEquals(main.DFA(g.toCharArray()), true);
        Assertions.assertEquals(main.DFA(h.toCharArray()), true);
    }

    @org.junit.jupiter.api.Test
    void DFAFalseTests() {
        String s = "1101";
        String d = "1010";
        String f = "10000100010";
        String g = "1011110110111";
        String h = "101010101010101010101010101";
        Assertions.assertEquals(main.DFA(s.toCharArray()), false);
        Assertions.assertEquals(main.DFA(d.toCharArray()), false);
        Assertions.assertEquals(main.DFA(f.toCharArray()), false);
        Assertions.assertEquals(main.DFA(g.toCharArray()), false);
        Assertions.assertEquals(main.DFA(h.toCharArray()), false);
    }
}