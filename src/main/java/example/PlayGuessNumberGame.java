package example;

import java.util.Scanner;

public class PlayGuessNumberGame {

    public String getConsoleInput(){
        Scanner scanner = new Scanner(System.in);
        String guessNum = scanner.next().replace(" ", "");
        return guessNum;
    }
    public String GenerateAnswer(){
        GenerateRightFormatAnswer generateRightFormatAnswer = new GenerateRightFormatAnswer();
        String answer = generateRightFormatAnswer.generateAnswer();
        System.out.println("四位数字答案已生成，请输入你要猜的数字：");
        return  answer;
    }
    public String filterNumber(String number){
        NumberFilter numberFilter = new NumberFilter(number);
        String output = numberFilter.filter();
        return output;
    }
    public String guess(String guessNum,String answerNum){
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerNum);
        String result = guessNumberGame.guess(guessNum);
        return result;
    }
    public void playGuessNumberGame() {
        String guessNum=getConsoleInput();
        int count = 0;
        while (count < 6) {
            String answer=GenerateAnswer();
            String output = filterNumber(guessNum);
            if (output.equals("Pass")) {
                String result = guess(guessNum,answer);
                System.out.println(result);
            } else {
                System.out.println(output);
                guessNum = getConsoleInput();
            }
            count++;
        }
        System.out.println("机会用完");
    }

}