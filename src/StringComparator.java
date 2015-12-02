import java.util.Comparator;

/**
 * Created by YB on 02.12.2015.
 */
public class StringComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {

        if (o1.equals(o2)) {
            return 0;
        } else if (o1.compareTo(o2) > 0) {
            return -1;
        } else if (o1.compareTo(o2) < 0)  {
            return 1;
        } else {
            throw new IllegalStateException("Unspecified situation!");
        }
    }

}
