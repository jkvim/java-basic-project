/**
 * Created by zhlin on 1/11/17.
 */
class FizzBuzz {
    static String getCode(int number) {
        if (number % 3 == 0) {
            return "Fizz";

        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return number + "";
    }
}
