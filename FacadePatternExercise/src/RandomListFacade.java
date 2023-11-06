import java.util.ArrayList;
import java.util.List;

public class RandomListFacade {
    public static void printRandomEvenList() {
        List<Object> list = new ArrayList<>(ListFilter.filterOdd(RandomList.generateList()));
        ListPrinter.printList(list);
    }
}
