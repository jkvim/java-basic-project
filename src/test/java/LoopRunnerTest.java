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
}
