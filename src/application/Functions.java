package application;
import java.util.ArrayList;
import java.time.YearMonth;

/**
 * Funções auxiliares
 *
 */

public class Functions {
    /**
     *
     * @param ano : ano de pesquisa;
     * @param mes : mes de pesquisa;
     * @return quantidade de dias(Mes);
     */
    public int days(int ano, int mes){
        YearMonth a = YearMonth.of(ano,mes);
        return a.lengthOfMonth();
    }

    /**
     *
     * @param dados : recebe ArrayList de Médias diárias
     * @return média mensal
     */
    public double media(ArrayList<Double> dados){
        double cont=0;
        for(int i=0;i < dados.size(); i++){
            cont+=dados.get(i);
        }
        return (cont/dados.size());
    }

    /**
     * print mensagens para o úsuario;
     */
    public void menu(int ano, int mes){
        if(ano==0 && mes==0)System.out.println("\nO QUE DESEJA CONSULTAR ?\n");
        else System.out.printf("\n----Data Atual %d/%d----\n", mes, ano);
        System.out.println("1 - Calculo da temperatura media");
        System.out.println("2 - Calculo da temperatura minima");
        System.out.println("3 - Calculo da temperatura maxima");
        System.out.println("4 - Relatorio meteorologico");
        System.out.println("0 - Para consultar outra data/Cancelar");
        System.out.println("____________________________________________________________");
    }
    public void msg (int a, int decisao){
        if(decisao<=0 || decisao > 4)System.exit(0);
        switch (a){
            case 1:
                System.out.print("Digite o Mes(1-12):");
                break;
            case 2:
                System.out.print("Digite o Ano (2011-2020):");
                break;
            default:
                break;
        }
    }

    /**
     *
     * @param dados : recebe arraylist de dados,
     * @param maiorMenor : recebe a maior ou menor média diária,
     * @return Arraylist com os dias que foram registradas média iguais
     */
    public Calc minMax(ArrayList<Double> dados, double maiorMenor){
        Calc listDay = new Calc();
        for(int i=0;i < dados.size(); i++){
            if(dados.get(i)==maiorMenor)listDay.setDays(i);
        }
        return listDay;
    }

    /**
     *
     * @param days : recebe ArrayLis de dias,
     * @param mes : recebe mes de pesquisa,
     * @param ano : recebe ano de pesquisa
     */
    public void printDays(ArrayList<Integer> days,int mes, int ano){
        for(int i=0; i < days.size() ; i++){
            System.out.printf("%d/%d/%d\n", (days.get(i)+1), mes, ano);
        }
    }
}
