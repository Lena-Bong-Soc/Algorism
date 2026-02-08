import java.util.ArrayList;
import java.util.Collections;

public class Bai6 {
    public static void main(String[] args) {
        // Search insert position
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(6);

        int target = 7;
        int i = 0;
        for (i = 0; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                i = nums.get(i);
                break;
            }
        }
        nums.add(target);
        Collections.sort(nums);
        i = nums.indexOf(target);
        System.out.println(i);

    }
}
