package sort;

// 선택 정렬
// -> 최소값을 앞으로
public class main {

    public static void main(String[] args) {


        int arr[] = {4,7,2,6,1};
        int min;
        int temp;

        for(int i=0; i<arr.length-1; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j] ){
                    min = j;
                }
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }

    }

}
