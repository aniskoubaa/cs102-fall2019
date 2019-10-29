package topic04.genericclasses;

import topic04.generics.*;


public class Pair <K extends Comparable<K>,V > {
    
    private K key;
    private V value;
    
    public Pair(K first, V second) {
        this.key = first;
        this.value = second;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K first) {
        this.key = first;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V second) {
        this.value = second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + key + ", second=" + value + '}';
    }
 
    
}
