import java.util.*;

public class main2 {
    //https://yoonpunk.tistory.com/8
// set list 차이
    public static void main(String[] args) {

        int[][] data = {
                {1,1,2,3,10},
                {1,1,2,3,10},
                {2,4,2,7,10},
        };

        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
//        int thisKey=0;
        Map<Integer,Integer> map2 = new HashMap<>();
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

                if(max < val){
                    max = val;
                    map2.put(key,val);
                }else if(max == val){
                    map2.put(key,val);
                }

                map.put(key, val);
            }
        }



        System.out.println(map.toString());
        System.out.println(max);
        System.out.println(map2.toString());
    }
}
