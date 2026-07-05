package Collections.FinancialTransaction_system;

import java.util.ArrayList;

public class FinancialLedger <T extends Transaction>{
    ArrayList<T> list = new ArrayList<>();

    public void record(T transaction){
        list.add(transaction);
    }

    public T findHighestValue(){
        if (list.isEmpty()){
            return null;
        }
        T highestValue = list.getFirst();
        for (T t : list){
            if (t.getAmount() > highestValue.getAmount()){
                highestValue = t;
            }
        }
        return highestValue;
    }

    public ArrayList<T> filterByValue(double threshold){
        ArrayList<T> newList = new ArrayList<>();

        for (T t : list){
            if (t.getAmount() > threshold){
                newList.add(t);
            }
        }

        return newList;
    }
}
