import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public static List<Integer> filterOdd(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
