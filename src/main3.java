import java.util.*;

public class main3 {
    //https://yoonpunk.tistory.com/8
// set list 차이
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,4,4,4,3,3,2));
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }

        System.out.println(list2.toString());
    }
}
