package example;

public class GenerateRightFormatAnswer implements AnswerGenerate {
    @Override
    public String generateAnswer() {
        int randomNum=getRandomNumber();
        String randomStringNum=randomNum+"";
        NumberFilter numberFilter=new NumberFilter(randomStringNum);
        if(numberFilter.filter().equals("Pass")){
            return randomStringNum;
        }else{
            return generateAnswer();
        }

    }

    private int getRandomNumber(){
        return (int)((Math.random()*9+1)*1000);
    }
}