import java.util.Iterator;
import java.util.Arrays;
import java.util.TreeMap;

public class AssociationTable<K extends Comparable,V> extends TreeMap {

    //constructor
    public AssociationTable(){super();}
    public AssociationTable(K[] keys, V[] values){

        int size = keys.length;

        for(int i=0; i < keys.length; i++){
            add(keys[i],values[i]);
        }
    }

    //methods
    public void add(K key, V value){ //add values
        super.put(key,value);
    }
    public V get(K key){ //return values
        return (V) super.get(key);
    }
    public boolean contains(K key){ // return if key is in table
        return super.containsKey(key);
    }
    public boolean remove(K key){ //remove element

        if( get(key) != null ){
            super.remove(key);
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){ // return number of table elements
        return super.size();
    }
    public Iterator KeyIterator(){ // return table iterator

        return (Arrays.asList( super.keySet() )).iterator();
    }

    public static void main(String[] args) {

        Integer[] keys = {0,13,25,4};
        String[] values = {"qwe","gf","mnb","ytu"};

        AssociationTable t2 = new AssociationTable(keys,values);
        System.out.println( t2 );

        AssociationTable t1 = new AssociationTable();

        t1.add(0,"sdfgsdf");
        t1.add(7,"yui");
        t1.add(8,"vbn");
        t1.add(3,"qew");
        t1.add(1,"nmui");
        System.out.println( t1 );
        System.out.println( t1.contains(0));
        int sz = t1.size();
        t1.remove(3);
        Iterator i = t1.KeyIterator();
        //AssociationTable t2 = new AssociationTable(4,"name");
        System.out.println("Hello World!");
    }
}
