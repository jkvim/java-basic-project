import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by zhlin on 1/11/17.
 */
public class LoopRunnerTest {
    @Test
    public void test_run_should_return_12_between_1_and_3() {
        assertThat(LoopRunner.run(1, 3)).isEqualTo("12");
    }

    @Test
    public void test_run_should_return_fizz_between_3_and_4() {
        assertThat(LoopRunner.run(3, 4)).isEqualTo("Fizz");
    }

    @Test
    public void test_run_should_return_buzz_between_5_and_6() {
        assertThat(LoopRunner.run(5, 6)).isEqualTo("Buzz");
    }

    @Test
    public void test_run_should_return_fizzbuzz_between_15_and_16() {
        assertThat(LoopRunner.run(15, 16)).isEqualTo("FizzBuzz");
    }
}
