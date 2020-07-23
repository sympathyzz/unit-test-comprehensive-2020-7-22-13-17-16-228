package example;

public class GuessNumberGame {
    private String answer;
    public GuessNumberGame(String answer) {
        this.answer=answer;
    }

    public String guess(String guessNum) {
        int countA=0;
        int countB=0;
        for(int i=0;i<guessNum.length();i++){
            for(int j=0;j<answer.length();j++){
                if(guessNum.charAt(i)==answer.charAt(j)&&i==j){
                    countA++;
                }
                if(guessNum.charAt(i)==answer.charAt(j)&&i!=j){
                    countB++;
                }
            }
        }
        return countA+"A"+countB+"B";
    }
}