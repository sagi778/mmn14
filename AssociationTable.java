import java.util.List;
import java.util.TreeMap;

public class AssociationTable<K extends Comparable,V> extends TreeMap {

    //constructor
    public AssociationTable(){super();}
    public AssociationTable(K[] keys, V[] values){

        int i=0;
        while( !keys[i].equals(null)){

            super.put(keys[i],values[i]);
            i++;
        }

    }

    //methods
    public void add(K key, V value){ //add value to table
        super.put(key,value);
    }

    public boolean contains(K key){
        return super.containsKey(key);
    }


    //public void add(K,V){}
    //public <V> get(<K>){}
    //public boolean contains(){}
    //public K remove(){}



    public static void main(String[] args) {

        Integer[] keys = {0,1,2,4};
        String[] values = {"qwe","gf","mnb","ytu"};

        AssociationTable t1 = new AssociationTable(keys,values);

        AssociationTable t2 = new AssociationTable();
        t1.add(0,"sdfgsdf");
        t1.add(7,"yui");
        t1.add(8,"vbn");
        t1.add(3,"qew");
        t1.add(1,"nmui");
        System.out.println( t1.contains(0));
        //AssociationTable t2 = new AssociationTable(4,"name");
        System.out.println("Hello World!");
    }
}
