import java.util.List;
import java.util.Objects;

public class ListPrinter {
    public static void printList(List<Object> list) {
        StringBuilder result = new StringBuilder("{");

        for (Object o : list) {
            result.append(o).append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");

        System.out.println(result);
    }
}
