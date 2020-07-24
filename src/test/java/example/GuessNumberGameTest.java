package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {

    @Test
    void should_return_4A0B_when_guess_number_given_1234(){
        //given
        AnswerGenerate mockedAnswerGenerate=Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generateAnswer()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate.generateAnswer());
        String guessNumber="1234";
        //when
        String result=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("4A0B",result);
    }
    @Test
    void should_return_0A0B_when_guess_number_given_5678(){
        //given
        AnswerGenerate mockedAnswerGenerate=Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generateAnswer()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate.generateAnswer());
        String guessNumber="5678";
        //when
        String result=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A0B",result);
    }
    @Test
    void should_return_3A0B_when_guess_number_given_1235(){
        //given
        AnswerGenerate mockedAnswerGenerate=Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generateAnswer()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate.generateAnswer());
        String guessNumber="1235";
        //when
        String result=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("3A0B",result);
    }
    @Test
    void should_return_0A3B_when_guess_number_given_3512(){
        //given
        AnswerGenerate mockedAnswerGenerate=Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generateAnswer()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate.generateAnswer());
        String guessNumber="3512";
        //when
        String result=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A3B",result);
    }
    @Test
    void should_return_2A2B_when_guess_number_given_1243(){
        //given
        AnswerGenerate mockedAnswerGenerate=Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generateAnswer()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate.generateAnswer());
        String guessNumber="1243";
        //when
        String result=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("2A2B",result);
    }

}