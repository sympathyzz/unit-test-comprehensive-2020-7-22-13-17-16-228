package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateRightFormatAnswerTest {
    @Test
    void should_return_pass_when_check_generate_right_format_answer_given_generated_answer(){
        //given
        GenerateRightFormatAnswer generateRightFormatAnswer=new GenerateRightFormatAnswer();
        NumberFilter filter=new NumberFilter(generateRightFormatAnswer.generateAnswer());
        //when
        String output=filter.filter();
        //then
        assertEquals("Pass",output);
    }
}