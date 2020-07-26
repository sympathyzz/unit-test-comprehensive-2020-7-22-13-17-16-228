package example;

import java.util.Scanner;

public class PlayGuessNumberGame {

    public String getConsoleInput(){
        Scanner scanner = new Scanner(System.in);
        String guessNum = scanner.nextLine().replace(" ", "");
        return guessNum;
    }
    public String GenerateAnswer(){
        GenerateRightFormatAnswer generateRightFormatAnswer = new GenerateRightFormatAnswer();
        String answer = generateRightFormatAnswer.generateAnswer();
        System.out.println("四位数字答案已生成，请输入你要猜的数字：");
        return  answer;
    }
    public String filterNumber(String number){
        NumberFilter numberFilter = new NumberFilter();
        String output = numberFilter.filter(number);
        return output;
    }
    public String guess(String guessNum,String answerNum){
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerNum);
        String result = guessNumberGame.guess(guessNum);
        return result;
    }
    public void playGuessNumberGame() {
        String answer=GenerateAnswer();
        int count = 0;
        while (count < 6) {
            String guessNum=getConsoleInput();
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
        System.out.println("机会用完,游戏结束,正确答案为："+answer);
    }

    public static void main(String[] args) {
        PlayGuessNumberGame playGuessNumberGame=new PlayGuessNumberGame();
        playGuessNumberGame.playGuessNumberGame();
    }
}