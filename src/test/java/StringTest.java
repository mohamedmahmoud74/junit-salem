import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Execution(ExecutionMode.CONCURRENT)
public class StringTest
{
    @ParameterizedTest
/*
    @ValueSource(strings = {"maram", "radar","level"})
*/

    @MethodSource("getPalindromeString")
    void testParamtrized(String input ){
        assertEquals(input , new StringBuilder(input).reverse().toString());
    }


    private static Stream<String> getPalindromeString()
    {
       return  Stream.of("maram", "radar","level");
    }


}
