package urmomshouse;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        getEvens(list);
    }

    public static void getEvens(List<Integer> list) {
        ListMonad<Integer> listMonad = new ListMonad<>(list, x -> {
            List<Integer> newList = new ArrayList<>();
            for (int i: x){
                if (i % 2 == 0){
                    newList.add(i);}
            }
            return x;
        });
        listMonad.printList();
    }
}
 