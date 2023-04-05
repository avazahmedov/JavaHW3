import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        FirstTask firstTask = new FirstTask();
        int [] res = firstTask.sort(firstTask.arr);
        System.out.println(Arrays.toString(res));
//        SecondTask secondTask = new SecondTask();
//        System.out.println(secondTask.deleteEven());

//        ThirdTask thirdTask = new ThirdTask();
//        thirdTask.findMinMax();
//        thirdTask.findAve();
    }
}
