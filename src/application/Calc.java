package application;
import java.util.ArrayList;

/**
 * Class Calc dias;
 */
public class Calc {

    private ArrayList <Integer> day = new ArrayList<Integer>();

    //Setar dias de Menor ou Maior média
    public void setDays(int day) {
        this.day.add(day);
    }
    //Pegar dias setados
    public ArrayList<Integer> getDays(){
        return this.day;
    }
}
