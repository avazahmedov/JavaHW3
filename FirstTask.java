import java.util.Arrays;

public class FirstTask {
    int[] arr;
    FirstTask(){
        arr = new int[] {10, 34, 2, 56, 35, 9, 21, 74, 69, 5, 21, 68, 60, 4, 98};
    }
    public int[] sort(int[] arr){

        if (arr.length < 2){
            return arr;
        }
        int [] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
        int [] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length/1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return mergeArray(sort(arr1), sort(arr2));
    }

    public int[] mergeArray(int[] arr1, int[] arr2 ){
        int[] arrX = new int[arr1.length + arr2.length];
        int pos1 = 0;
        int pos2 = 0;
        int posX = 0;

        while (pos1 < arr1.length && pos2 < arr2.length)
            if (arr1[pos1] < arr2[pos2]){
                arrX[posX++] = arr1[pos1++];
            } else arrX[posX++] = arr2[pos2++];

        while (posX < arrX.length)
            if (pos1 != arr1.length){
                arrX[posX++] = arr1[pos1++];
            } else arrX[posX++] = arr2[pos2++];
        return arrX;
    }
}
