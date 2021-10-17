package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_multiple_numbers_should_return_sum_as_int() {
    	StringCalculator calculator = new StringCalculator();
    	assertEquals(10, calculator.add("1,2,3,4"));
    	
    	
    }
    @Test
    void string_with_newline_should_return_sum_as_int() {
    	StringCalculator calculator = new StringCalculator();
    	assertEquals(10, calculator.add("1\n2,3\n4"));
    }
    
    @Test
    void string_with_different_delimiters_should_return_sum_as_int() {
    	StringCalculator calculator = new StringCalculator();
    	assertEquals(10, calculator.add("//;\n1;2;3;4"));
    }
}
