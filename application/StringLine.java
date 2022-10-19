

public class StringLine {
    private int size;
    private String result = "";


    public StringLine(int size, String charactere) {
        this.size = size;
        for(int i = 1; i <= size; i++){
            result += charactere + " ";
        }
    }


    @Override
    public String toString() {
        return result;
    }


    

    
}
