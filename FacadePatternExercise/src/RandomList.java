import java.util.ArrayList;
import java.util.List;

public class RandomList {

    public static List<Integer> generateList() {
        List<Integer> randomList = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            int randomInt = (int) (Math.random()*100);
            randomList.add(randomInt);
        }
        return randomList;
    }
}
