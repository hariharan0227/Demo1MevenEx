package com.lti;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestArgument {
	@ParameterizedTest
    @ValueSource(ints = {8,4,2,6,12})
    void test_int_arrays(int arg) {
      System.out.println("arg => "+arg);
      Assertions.assertTrue(arg % 2 == 0);
    }   
	
	@DisplayName("Should pass a non-null message to our test method")
	    @ParameterizedTest
	    @ValueSource(strings = {"Hello"})
	    void testParam(String message) {
		 Assertions.assertNotNull(message);
	    }

		@ParameterizedTest(name="#{index} - Test with Argument={0}")
	    @ValueSource(strings = {"Peter King", "Arthur King", "Martin King"})
	    void test_string_arrays(String arg) {
	      String searchKey = "King";
	      
	      System.out.println("arg => "+arg);
	      Assertions.assertTrue(arg.contains(searchKey));
	    }  

}
