package example;

import java.util.Scanner;

public class PlayGuessNumberGame {


    public static void main(String[] args) {
        GenerateRightFormatAnswer generateRightFormatAnswer = new GenerateRightFormatAnswer();

        int count = 1;
        String answer = generateRightFormatAnswer.generateAnswer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("四位数字答案已生成，请输入你要猜的数字：");
        String guessNum = scanner.next().replace(" ", "");
        while (count < 6) {
            count++;
            NumberFilter numberFilter = new NumberFilter(guessNum);
            String output = numberFilter.filter();
            if (output.equals("Pass")) {
                GuessNumberGame guessNumberGame = new GuessNumberGame(guessNum);
                String result = guessNumberGame.guess(answer);
                System.out.println(result);
            } else {
                System.out.println(output);
                guessNum = scanner.next().replace(" ", "");
            }
        }
        System.out.println("机会用完");
        System.exit(0);
    }

}