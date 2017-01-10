import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by zhlin on 1/11/17.
 */
public class FizzBuzzTest {
    @Test
    public void test_getcode_should_return_1_given_1() {
        assertThat(FizzBuzz.getCode(1)).isEqualTo("1");
    }

    @Test
    public void test_getcode_should_return_fizz_given_3() {
        assertThat(FizzBuzz.getCode(3)).isEqualTo("Fizz");
    }

}
