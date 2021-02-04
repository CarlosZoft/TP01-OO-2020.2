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
    public static int days(int ano, int mes){
        YearMonth yearMonthObject = YearMonth.of(ano,mes);
        return yearMonthObject.lengthOfMonth();
    }

    /**
     *
     * @param dados : recebe ArrayList de Médias diárias
     * @return média mensal
     */
    public static double media(ArrayList<Double> dados){
        double cont=0;
        for(int i=0;i < dados.size(); i++){
            cont+=dados.get(i);
        }
        return (cont/dados.size());
    }

    /**
     * print mensagens para o úsuario;
     */
    public static void menu(){
        System.out.println("O QUE DESEJA CONSULTAR ?\n");
        System.out.println("1 - Cálculo da temperatura média");
        System.out.println("2 - Cálculo da temperatura mínima");
        System.out.println("3 - Cálculo da temperatura máxima");
        System.out.println("4 - Relatório meteorológico\n");
        System.out.println("DIGITE QUALQUER NUMERO DIFERENTE PARA CANCELAR");
    }
    public static void msg (int a, int decisao){
        if(decisao<=0 || decisao > 4)System.exit(0);
        switch (a){
            case 1:
                System.out.print("Digite o Mês(1-12):");
                break;
            case 2:
                System.out.print("Digite o Ano (2077):");
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
    public static Calc minMax(ArrayList<Double> dados, double maiorMenor){
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
    public static void printDays(ArrayList<Integer> days,int mes, int ano){
        for(int i=0; i < days.size() ; i++){
            System.out.printf("%d/%d/%d\n", (days.get(i)+1), mes, ano);
        }
    }
}
