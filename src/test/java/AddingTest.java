import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddingTest {
    @Test
    void shouldCheckTheSumOfTwoPositiveNumbers(){
        Adding adding = new Adding();

        int expectedSum = adding.findSum(2,2);
        int actualSum = 4;

        assertThat(actualSum, is(equalTo(expectedSum)));
    }
}
