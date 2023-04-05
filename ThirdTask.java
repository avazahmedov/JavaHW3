import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class ThirdTask {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ThirdTask(){
        arr.add(54);
        arr.add(175);
        arr.add(2);
        arr.add(10);
        arr.add(41);
        arr.add(78);
        arr.add(48);
        arr.add(24);
        System.out.println(arr);
    }

    public void findMinMax(){
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
    }

    public void findAve(){
        int ave = 0;
        for (int i = 1; i < arr.size(); i++) {
            ave += arr.get(i);
        }
        ave = ave/arr.size();
        System.out.println(ave);;
    }
}
