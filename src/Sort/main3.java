package Sort;

// 삽입 정렬(거의 정렬된 상태에선 가장 빠르다.)
public class main3 {

    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 6, 1};
        int key;

        for (int i = 1; i < arr.length ; i++) {
            key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;

        }

        // 출력
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

    }

}
