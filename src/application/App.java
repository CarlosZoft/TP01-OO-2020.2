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
        System.out.printf("Agora digite as medias de temperatura dos %d dias. Ex:29,7\n", days);
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
        while(decisao!=0){
            switch (decisao) {
                case 1:
                    System.out.printf("Temperatura media do mes informado : %.2f °C\n", aux.media(dados.getDados()));
                    break;
                case 2:
                    System.out.printf("Temperatura minima do mes informado : %.2f °C no(s) dia(s):\n", menor);
                    Calc listDays = aux.minMax(dados.getDados(), menor);
                    aux.printDays(listDays.getDays(), mes, ano);
                    break;
                case 3:
                    System.out.printf("Temperatura maxima do mes informado : %.2f °C no(s) dia(s):\n", maior);
                    listDays = aux.minMax(dados.getDados(), maior);
                    aux.printDays(listDays.getDays(), mes, ano);
                    break;
                case 4:
                    System.out.printf("Medias de temperadaturas do dia 1 ao %d ,respectivamente:\n", days);
                    dados.listaDados();
                    System.out.printf("\nMedia de temperadatura do periodo %d/%d : %.2f °C\n", mes, ano, aux.media(dados.getDados()));
                    System.out.printf("Minima de temperadatura do periodo %d/%d : %.1f °C\n", mes, ano, menor);
                    System.out.printf("Maxima de temperadatura do periodo %d/%d : %.1f °C\n", mes, ano, maior);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
                aux.menu();
                decisao = scan.nextInt();
        }
    }
}
