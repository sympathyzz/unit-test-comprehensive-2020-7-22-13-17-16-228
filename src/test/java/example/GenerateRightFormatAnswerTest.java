package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateRightFormatAnswerTest {
    @Test
    void should_return_pass_when_check_generate_right_format_answer_given_generated_answer(){
        //given
        GenerateRightFormatAnswer generateRightFormatAnswer=new GenerateRightFormatAnswer();
        String generatedAnswer=generateRightFormatAnswer.generateAnswer();
        //when
        NumberFilter filter=new NumberFilter();
        String output=filter.filter(generatedAnswer);
        //then
        assertEquals("Pass",output);
    }
}