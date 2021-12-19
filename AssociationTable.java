import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AssociationTable<K,V> {

    //attributes
    private List<K> _key;
    private List<V> _value;

    //constructor
    public AssociationTable(){}
    public AssociationTable(K key,V value){
        _key.add(key);
        _value.add(value);
    }

    //get
    //public <V> get(K){retrun _value[0];}

    //methods
    //public void add(K,V){}
    //public <V> get(<K>){}
    //public boolean contains(){}
    //public K remove(){}

    public static void main(String[] args) {
        AssociationTable t1 = new AssociationTable<K,V>();
        AssociationTable t2 = new AssociationTable(4,100);
        System.out.println("Hello World!");
    }
}
