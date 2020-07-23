package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberFilterTest {
    @Test
    void should_return_wrong_input_when_filter_number_given_12(){
        //given
        NumberFilter filter=new NumberFilter("12");
        //when
        String output=filter.filter();
        //then
        assertEquals("Wrong Input,Input again",output);
    }
    @Test
    void should_return_pass_when_filter_number_given_1234(){
        //given
        NumberFilter filter=new NumberFilter("1234");
        //when
        String output=filter.filter();
        //then
        assertEquals("Pass",output);
    }
    @Test
    void should_return_pass_input_when_filter_number_given_5678(){
        //given
        NumberFilter filter=new NumberFilter("5678");
        //when
        String output=filter.filter();
        //then
        assertEquals("Pass",output);
    }
}