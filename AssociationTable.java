import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class AssociationTable<K extends Comparable,V> extends TreeMap {

    //constructor
    public AssociationTable(){super();}
    public AssociationTable(K[] keys, V[] values){///////////////////////////////////

        int i=0;
        while( !keys[i].equals(null)){

            add(keys[i],values[i]);
            i++;
        }

    }

    //methods
    public void add(K key, V value){ //add value to table
        super.put(key,value);
    }
    public V get(K key){
        return (V) super.get(key);
    }
    public boolean contains(K key){
        return super.containsKey(key);
    }
    public boolean remove(K key){

        if( get(key) != null ){
            super.remove(key);
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){return super.size();}
    public Iterator KeyIterator(){

        //super.floorKey()
    }

    public static void main(String[] args) {

        Integer[] keys = {0,1,2,4};
        String[] values = {"qwe","gf","mnb","ytu"};

        //AssociationTable t2 = new AssociationTable(keys,values);

        AssociationTable t1 = new AssociationTable();
        t1.add(0,"sdfgsdf");
        t1.add(7,"yui");
        t1.add(8,"vbn");
        t1.add(3,"qew");
        t1.add(1,"nmui");
        System.out.println( t1.contains(0));
        int sz = t1.size();
        t1.remove(3);
        Iterator i = t1.KeyIterator();
        //AssociationTable t2 = new AssociationTable(4,"name");
        System.out.println("Hello World!");
    }
}
