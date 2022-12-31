package dasm;

import java.util.Comparator;
/**
 * Returns a value based on players' points
 * used in export sorting process
 * @author Kyle Mullen, 2022
 */
public class PlayerComparator implements Comparator<Players> {

    @Override
    public int compare(Players o1, Players o2) {
        if (o1.getPoints() > o2.getPoints()) {
            return -1;
        }
        return 1;
    }
    
}
