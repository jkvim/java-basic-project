/**
 * Created by zhlin on 1/11/17.
 */
class LoopRunner {
    public static String run(int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += FizzBuzz.getCode(i);
        }
        return result;
    }
}
