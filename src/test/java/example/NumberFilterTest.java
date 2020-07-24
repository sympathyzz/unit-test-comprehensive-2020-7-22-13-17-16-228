package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberFilterTest {
    @Test
    void should_return_wrong_input_when_filter_number_given_12(){
        //given
        String input="12";
        NumberFilter filter=new NumberFilter(input);
        //when
        String output=filter.filter();
        //then
        assertEquals("Wrong Input,Input again",output);
    }
    @Test
    void should_return_pass_when_filter_number_given_1234(){
        //given
        String input="1234";
        NumberFilter filter=new NumberFilter(input);
        //when
        String output=filter.filter();
        //then
        assertEquals("Pass",output);
    }
    @Test
    void should_return_pass_input_when_filter_number_given_5678(){
        //given
        String input="5678";
        NumberFilter filter=new NumberFilter(input);
        //when
        String output=filter.filter();
        //then
        assertEquals("Pass",output);
    }
}