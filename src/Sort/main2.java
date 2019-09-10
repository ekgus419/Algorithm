package Sort;

// 버블 정렬
public class main2 {

    public static void main(String[] args) {


        int arr[] = {4,7,2,6,1};
        int temp;

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<=5-i; j++){
                if(j+1 <= 4){
                    if(arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }

    }

}
