import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by zhlin on 1/11/17.
 */
public class FizzBuzzTest {
    @Test
    public void test_getcode_should_return_string_of_given_number() {
        assertThat(FizzBuzz.getCode(1)).isEqualTo("1");
        assertThat(FizzBuzz.getCode(2)).isEqualTo("2");
        assertThat(FizzBuzz.getCode(13)).isEqualTo("13");
    }

    @Test
    public void test_getcode_should_return_fizz() {
        assertThat(FizzBuzz.getCode(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.getCode(6)).isEqualTo("Fizz");
    }

    @Test
    public void test_getcode_should_return_buzz() {
        assertThat(FizzBuzz.getCode(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.getCode(10)).isEqualTo("Buzz");
    }

}
