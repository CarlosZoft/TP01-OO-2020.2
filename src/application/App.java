package application;

import java.util.Scanner;



public class App {
    /**
     *  Função Main;
     * @param args;
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Functions aux = new Functions();

        int mes, ano, decisao,days;

        double a,menor=1000, maior=-1000;
        aux.menu(0,0);
            decisao = scan.nextInt();
        while(decisao < 0 || decisao > 4){
            System.out.println("Opcao invalida! 1-4 ou 0");
            aux.menu(0,0);
            decisao = scan.nextInt();
        }
        aux.msg(1,decisao);
        mes = scan.nextInt();
        while(mes < 1 || mes > 12){
            System.out.println("Mes invalido! 1-12");
            aux.msg(1,decisao);
            mes = scan.nextInt();
        }

        aux.msg(2,decisao);
        ano = scan.nextInt();
        while(ano < 2011 || ano > 2020){
            System.out.println("Ano invalido! 2011-2020");
            aux.msg(2,decisao);
            ano = scan.nextInt();
        }
        //Quantidade de dias(Mês);
        days = aux.days(ano,mes);
        System.out.printf("Agora digite as medias de temperatura dos %d dias. Ex:29,7\n", days);
        Data dados = new Data();
        //leitura dias
        for(int i=1 ; i<= days ; i++){
            System.out.printf("dia %d : ", i);
            a = scan.nextDouble();
            dados.setDados(a);
            if(a<menor)menor=a;
            else if(a>maior)maior=a;
        }
        //Saida de dados relativo ao tipo de pesquisa
        while(decisao!=0){
            switch (decisao) {
                case 1:
                    System.out.printf("\nTemperatura media do mes informado : %.2f °C\n", aux.media(dados.getDados()));
                    break;
                case 2:
                    System.out.printf("\nTemperatura minima do mes informado : %.2f °C no(s) dia(s):\n", menor);
                    Calc listDays = aux.minMax(dados.getDados(), menor);
                    aux.printDays(listDays.getDays(), mes, ano);
                    break;
                case 3:
                    System.out.printf("\nTemperatura maxima do mes informado : %.2f °C no(s) dia(s):\n", maior);
                    listDays = aux.minMax(dados.getDados(), maior);
                    aux.printDays(listDays.getDays(), mes, ano);
                    break;
                case 4:
                    System.out.printf("\nMedias de temperaturas do dia 1 ao %d ,respectivamente:\n", days);
                    dados.listaDados();
                    System.out.printf("\nDados obtidos do periodo %d/%d\n", mes, ano);
                    System.out.printf("Media : %.2f °C\n", aux.media(dados.getDados()));
                    System.out.printf("Minima : %.1f °C\n", menor);
                    System.out.printf("Maxima : %.1f °C\n", maior);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            aux.menu(ano,mes);
            decisao = scan.nextInt();
            while(decisao < 0 || decisao > 4){
                System.out.println("Opcao invalida! Digite novamente : ");
                aux.menu(ano,mes);
                decisao = scan.nextInt();
            }
            if(decisao == 0)System.exit(0);
        }
    }
}
