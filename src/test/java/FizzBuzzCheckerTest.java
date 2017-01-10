import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzCheckerTest {
    public void test_isFizz_should_return_false() {
        assertThat(FizzBuzzChecker.isFizz(1)).isFalse();
        assertThat(FizzBuzzChecker.isFizz(5)).isFalse();
    }

    public void test_isFizz_should_return_true() {
        assertThat(FizzBuzzChecker.isFizz(3)).isTrue();
        assertThat(FizzBuzzChecker.isFizz(9)).isTrue();
    }

    public void test_isBuzz_should_return_false() {
        assertThat(FizzBuzzChecker.isBuzz(2)).isFalse();
        assertThat(FizzBuzzChecker.isBuzz(3)).isFalse();
    }

    public void test_isBuzz_should_return_true() {
        assertThat(FizzBuzzChecker.isBuzz(5)).isTrue();
        assertThat(FizzBuzzChecker.isBuzz(10)).isTrue();
    }
}