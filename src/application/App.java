package application;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.YearMonth;
import java.util.Collections;
import java.io.IOException;


public class App {
    /**
     *  Função Main;
     * @param args
     */

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Functions aux = new Functions();

        int mes,ano,decisao,days,cont=1;
        double a,menor=1000, maior=-1000;
        aux.menu();
        decisao = scan.nextInt();
        aux.msg(1,decisao);
            mes = scan.nextInt();
        aux.msg(2,decisao);
            ano = scan.nextInt();
        //Quantidade de dias(Mês);
        days = aux.days(ano,mes);
        System.out.printf("Agora digite as média(s) de temperatura(s) dos %d dia(s)! Ex: 29,7\n", days);
        Data dados = new Data();
        //leitura dias
        while(cont <= days){
            System.out.printf("dia %d : ", cont);
            a = scan.nextDouble();
            dados.setDados(a);
            if(a<menor)menor=a;
            else if(a>maior)maior=a;
            cont++;
        }
        /**
         * Saida de dados relativo ao tipo de pesquisa
         */
        switch (decisao){
            case 1:
                System.out.printf("A temperatura média do mês informado é: %.2f °C", aux.media(dados.getDados()));
                break;
            case 2:
                System.out.printf("A temperatura mínima do mês informado é :%.2f °C no(s) dia(s):\n", menor);
                Calc listDays = aux.minMax(dados.getDados(),menor);
                aux.printDays(listDays.getDays(),mes, ano);
                break;
            case 3:
                System.out.printf("A temperatura mínima do mês informado é :%.2f °C no(s) dia(s):\n", maior);
                listDays = aux.minMax(dados.getDados(),maior);
                aux.printDays(listDays.getDays(),mes, ano);
                break;
            case 4:
                System.out.printf("Média de temperadaturas do dia 1 ao %d ,respectivamente:\n", days);
                dados.listaDados();
                System.out.printf("\nMédia de temperadatura do período %d/%d : %.2f °C\n", mes,ano,aux.media(dados.getDados()));
                System.out.printf("Mínima de temperadatura do período %d/%d : %.1f °C\n", mes,ano,menor);
                System.out.printf("Máxima de temperadatura do período %d/%d : %.1f °C\n", mes,ano,maior);
                break;
            default:
                System.out.println("Volte Sempre!");
                break;
        }
    }
}
