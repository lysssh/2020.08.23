import java.util.ArrayList;
import java.util.List;

/**
 * @author liye
 * @create 2020-08-23-19:00
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(6);

        System.out.println( list.indexOf(4));
        System.out.println(list.get(list.size()-1));

    }
}
