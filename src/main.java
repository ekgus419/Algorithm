import java.util.*;

public class main {
//https://yoonpunk.tistory.com/8
// set list 차이
    public static void main(String[] args) {


        int[][] data = {
                {1,1,2,3,10},
                {1,1,2,3,10},
                {2,4,2,7,10},
        };

        // 중복 최대값
        int max = 0;
        // 중복 최대값을 가진 키
        List<Integer> keyList = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                //1 배열 값 뽑는다
//                System.out.println("(" + i + "," + j +")" + "=" + data[i][j]   ) ;
                int key = data[i][j];
                int val;
                //2 1의값을 새로운 배열에 저장한다. ( 2-1 저장시 중복값 제외 )
//                map.put(data[i][j], count);
                // key가 있나있나 없나없나
                if(map.containsKey(key)){
                    // 있다 -> val 가져와서 val +1;
                    val = map.get(key)+1;
                }else{
                    // 없다 -> 키 넣고 val = 1
                    val=1;
                }
                map.put(key, val);

                // 최대값 찾기
                if(max < val) {
                    max = val;
                }
            }
        }
//        System.out.println(map.toString());
        int maxVal = Collections.max(map.values());
//        System.out.println(maxVal);
        System.out.println(getKeys(map,max).toString());


        // 최대값 max


    }


    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
//            System.out.print(key);
            System.out.print("test : "+map.get(key));

            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static List<Integer> getKeys(Map<Integer, Integer> map, int value) {
        List<Integer> keyList = new ArrayList<>();
        for (int key : map.keySet()) {
            if (value == map.get(key)) {
                keyList.add(key);
            }
        }
        return keyList;
    }
}
