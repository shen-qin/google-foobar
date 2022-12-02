import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int area) {
        List<Integer> output = new ArrayList<>();
        while(area != 0){
            int floor = (int) Math.sqrt(area);
            int nextSquareNum = floor * floor;
            output.add(nextSquareNum);
            area -= nextSquareNum;
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        //Test 1
        System.out.println("Expected: ");
        System.out.println("Actual: " + Arrays.toString(solution(12)));
    }
     
}