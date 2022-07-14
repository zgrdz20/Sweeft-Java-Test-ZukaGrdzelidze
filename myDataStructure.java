import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class myDataStructure  {

    private  ArrayList<LinkedList<Object>> arr;

    public  myDataStructure() {
        this.arr = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            LinkedList<Object> list = new LinkedList<>();
            arr.add(list);
        } 
        
    }

    public  void add(Object ob) {
        int hash = Math.abs(ob.hashCode()) % arr.size();
        arr.get(hash).add(ob);
    }

    public void remove(Object ob){
        int hash = Math.abs(ob.hashCode()) % arr.size();
        for (Object o : arr.get(hash)) {
            if(o.equals(ob)){
                arr.get(hash).remove(ob);
            }
        }


    }
}
