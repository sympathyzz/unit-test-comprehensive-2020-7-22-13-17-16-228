package example;

public class NumberFilter {
    private String input;
    public NumberFilter(String input) {
        this.input=input;
    }

    public String filter() {
        if(input.length()!=4 || isCharRepeat(input)){
            return "Wrong Input,Input again";
        }
        return "Pass";
    }
    public boolean isCharRepeat(String s){
        boolean[] bool = new boolean[256];
        for(byte a:s.getBytes()){
            if(bool[a])
                return true;
            else
                bool[a] = true;
        }
        return false;
    }
}
