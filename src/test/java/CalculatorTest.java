import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    static Stream<Arguments> provideArgumentsForProduceAddingOfNumbersTest() {
        return Stream.of(
                Arguments.of(1, 99, 100),
                Arguments.of(0, -7, -7),
                Arguments.of(-9, 0, -9),
                Arguments.of(5, 0, 5),
                Arguments.of(0, 5, 5),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsForProduceAddingOfNumbersTest")
    public void produceAddingOfNumbersTest(int firstParameter, int secondParameter, long expected) {
        long actual = new Calculator().produceAddingOfNumbers(firstParameter, secondParameter);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsProduceSubtractionOfNumbers() {
        return Stream.of(
                Arguments.of(100, 1, 99),
                Arguments.of(1, 100, -99),
                Arguments.of(-5, 10, -15),
                Arguments.of(-3, -2, -1),
                Arguments.of(-5, 0, -5),
                Arguments.of(0, -7, 7),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsProduceSubtractionOfNumbers")
    public void produceSubtractionOfNumbersTest(int firstParameter, int secondParameter, int expected) {
        int actual = new Calculator().produceSubtractionOfNumbers(firstParameter, secondParameter);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsProduceMultiplicationOfNumbers() {
        return Stream.of(
                Arguments.of(2, 2, BigInteger.valueOf(4)),
                Arguments.of(0, 3, BigInteger.valueOf(0)),
                Arguments.of(5, 0, BigInteger.valueOf(0)),
                Arguments.of(-5, 1, BigInteger.valueOf(-5)),
                Arguments.of(6, -1, BigInteger.valueOf(-6)),
                Arguments.of(-7, -1, BigInteger.valueOf(7)),
                Arguments.of(0, 0, BigInteger.valueOf(0))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsProduceMultiplicationOfNumbers")
    public void produceMultiplicationOfNumbersTest(int firstParameter, int secondParameter, BigInteger expected) {
        BigInteger actual = new Calculator().produceMultiplicationOfNumbers(firstParameter, secondParameter);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsProduceDivisionOfNumbers() {
        return Stream.of(
                Arguments.of(10, 4, 2.5),
                Arguments.of(2, 1, 2.0),
                Arguments.of(3, -1, -3.0),
                Arguments.of(-4, 1, -4.0),
                Arguments.of(-10, -2, 5.0),
                Arguments.of(0, 10, 0.0)
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsProduceDivisionOfNumbers")
    public void produceDivisionOfNumbersTest(int firstParameter, int secondParameter, double expected) {
        double actual = new Calculator().produceDivisionOfNumbers(firstParameter, secondParameter);
        assertEquals(expected, actual, 0.01);
    }
}
