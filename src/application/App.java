package application;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.YearMonth;
import java.util.Collections;

public class App {
    public static int days(int ano, int mes){
        YearMonth yearMonthObject = YearMonth.of(ano,mes);
        return yearMonthObject.lengthOfMonth();
    }
    public static double media(ArrayList<Double> dados){
        double cont=0;
        for(int i=0;i < dados.size(); i++){
           cont+=dados.get(i);
        }
        return (cont/dados.size());
    }
    public static void menu(){
        System.out.println("Oque deseja fazer :");
        System.out.println("1 - Cálculo da temperatura média");
        System.out.println("2 - Cálculo da temperatura mínima");
        System.out.println("3 - Cálculo da temperatura máxima");
        System.out.println("5 - Relatório meteorológico");
        System.out.println("0 - Sair");
    }
    public static void msg (int a){
        switch (a){
            case 1:
                System.out.print("Digite o Mês :");
                break;
            case 2:
                System.out.print("Digite o Ano :");
                break;
        }
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int mes,ano;
        menu();
        int decisao = scan.nextInt();
        msg(1);
        mes = scan.nextInt();
        msg(2);
        ano = scan.nextInt();
        int days = days(ano,mes);
        System.out.printf("Agora digite as médias(temperatura) dos %d dia(s)!\n", days);
        int cont = 1;
        Data dados = new Data();
        //leitura dias
        while(cont <= days){
            System.out.printf("dia %d :", cont);
            dados.setDados(scan.nextDouble());
            cont++;
        }

        switch (decisao){
            case 1:
                System.out.printf("A temperatura média do mês informado é :%.2f", media(dados.getDados()));
                break;
            case 2:
        }




    }
}
