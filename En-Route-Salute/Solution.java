
public class Solution {
    public static int solution(String s) {
        char[] charArray = s.toCharArray();
        int result = 0;
        int towardsRight = 0;

        for (char curChar : charArray) {
            if (curChar == '-')
                continue;

            if (curChar == '>')
                towardsRight++;

            else if (curChar == '<') {
                result += towardsRight * 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        System.out.println("Expected: 2");
        System.out.println("Actual: " + solution(">-----<"));

        System.out.println();

        System.out.println("Test 2");
        System.out.println("Expected: 4");
        System.out.println("Actual: " + solution("<<>><"));
    }

}
