/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Roducke
 */
public interface STInterface<Key extends Comparable<Key>, Value>
{
    public void put(Key key, Value val);

    public Value get(Key key);

    public void delete(Key key);

    public boolean contains(Key key);

    public boolean isEmpty();

    public int size();

    public Key min();

    public Key max();

    public Key floor();

    public Key ceiling(Key key);

    public int rank(Key key);

    public Key select(int k);

    public void deleteMin();

    public void deleteMax();

    public int size(Key lo, Key hi);

    Iterable<Key> keys(Key lo, Key hi);

    Iterable<Key> keys();

}
