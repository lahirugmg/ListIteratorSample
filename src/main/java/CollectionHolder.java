import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lahiru on 11/19/14.
 */
public class CollectionHolder {
    private List<String> myList1 = new ArrayList<String>();
    private List<String> myList2 = new ArrayList<String>();

    public List<String> getMyList1() {
        return myList1;
    }

    public List<String> getMyList2() {
        return myList2;
    }

    public CollectionHolder(){
        for (int i = 0; i < 10; i++) {
            myList1.add("" + i);
        }
    }

    public void moveItemFromOneToTwo(String item){
        Iterator<String> iterator = myList1.iterator();
        while(iterator.hasNext()){

            String member = iterator.next();
            if(item.equals(member)){
                iterator.remove();
                myList2.add(member);
            }

        }

    }
}
