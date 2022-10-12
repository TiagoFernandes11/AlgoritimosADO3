package entities;

public class StringTriangle {

    private int baseSize;
    private String charactere;
    private String resultado = "";


    public StringTriangle(int baseSize, String charactere) {
        for(int i = 1; i <= baseSize; i++){
            resultado += new StringLine(i, charactere) + "\n";
        }
    }
    public StringTriangle(int baseSize) {
        for(int i = 1; i <= baseSize; i++){
            resultado += new StringLine(i, i + "") + "\n";
        }
    }


    @Override
    public String toString() {
        return resultado;
    }

    
    
}
