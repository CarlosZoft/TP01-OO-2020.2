package application;
import java.util.ArrayList;

public class Data {
    private ArrayList <Double> dados = new ArrayList<Double>();

    public void setDados(double dados) {
        this.dados.add(dados);
    }

    public ArrayList<Double> getDados() {
        return this.dados;
    }
    public void listaDados() {
        for(int i=0;i < dados.size(); i++){
            System.out.println(dados.get(i));
        }
    }
}
