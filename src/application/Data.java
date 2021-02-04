package application;
import java.util.ArrayList;

/**
 * Class de dados
 */
public class Data {
    private ArrayList <Double> dados = new ArrayList<Double>();


    // Setar dados do ArrayList
    public void setDados(double dados) {
        this.dados.add(dados);
    }
    // Pegar dados do ArrayList
    public ArrayList<Double> getDados() {
        return this.dados;
    }
    // Listar dados no console
    public void listaDados() {
        for(int i=0 ;i < dados.size(); i++){
            if(i != 0)System.out.print(","+ dados.get(i));
            else System.out.print(dados.get(i));
        }
    }
}
