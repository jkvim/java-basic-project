import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by zhlin on 1/11/17.
 */
public class LoopRunnerTest {
    @Test
    public void test_run_should_with_range_time() {
        assertThat(LoopRunner.run(1, 4)).isEqualTo("12Fizz");
    }
}
