import org.junit.Before;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public Calculator calculatorTest;
    @Before

    static Stream<Arguments> provideArgumentsForProduceAddingNumbersTest() {
        return Stream.of(
                Arguments.of(1, 99, 100),
                Arguments.of(0, 5, 5)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForProduceAddingNumbersTest")
    public void produceAddingNumbersTest(int firstParameter, int secondParameter, int expected) {
        double actual = new Calculator().produceAddingNumbers(firstParameter, secondParameter);
        assertEquals(expected, actual);
    }
}
