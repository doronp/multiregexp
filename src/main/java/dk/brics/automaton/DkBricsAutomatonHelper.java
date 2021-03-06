package dk.brics.automaton;

import java.util.Set;
import java.util.TreeSet;


public class DkBricsAutomatonHelper {


    public static char[] pointsUnion(Iterable<Automaton> automata) {
        Set<Character> points = new TreeSet<Character>();
        for (Automaton automaton: automata) {
            for (char c: automaton.getStartPoints()) {
                points.add(c);
            }
        }
        char[] pointsArr = new char[points.size()];
        int i=0;
        for (Character c: points) {
            pointsArr[i] = c;
            i++;
        }
        return pointsArr;
    }
}
