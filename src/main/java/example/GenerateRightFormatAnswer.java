package example;

import java.util.HashSet;

public class GenerateRightFormatAnswer implements AnswerGenerate {
    @Override
    public String generateAnswer() {
        HashSet randomNumSet=new HashSet();
        while (randomNumSet.size()<4){
            randomNumSet.add(getRandomNumber());
        }
        Object[] randomNumArray=randomNumSet.toArray();
        StringBuilder randomNumStringBuilder=new StringBuilder();
        for(int i=0;i<randomNumArray.length;i++){
            randomNumStringBuilder.append(randomNumArray[i]);
        }
        String randomStringNum=randomNumStringBuilder.toString();
        NumberFilter numberFilter=new NumberFilter();
        if(numberFilter.filter(randomStringNum).equals("Pass")){
            return randomStringNum;
        }else{
            return generateAnswer();
        }

    }

    private int getRandomNumber(){
        return (int)((Math.random()*9+1));
    }
}