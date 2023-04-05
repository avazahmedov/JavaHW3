import java.util.ArrayList;

public class SecondTask {

    ArrayList<Integer> arr = new ArrayList<>();
    SecondTask(){
        arr.add(45);
        arr.add(54);
        arr.add(56);
        arr.add(57);
        arr.add(10);
        arr.add(13);
        arr.add(29);
        arr.add(28);
        arr.add(94);
        arr.add(42);
        arr.add(37);
    }

    public ArrayList deleteEven(){
        arr.removeIf(i -> (i%2==0));
        return arr;
    }
}
