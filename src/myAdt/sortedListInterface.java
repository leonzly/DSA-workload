/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myAdt;

/**
 *
 * @author leonlai
 */
public interface sortedListInterface <T>{
       // public abstract boolean add(T newEntry);
    public abstract void add(T newEntry);
    public abstract boolean remove(T anEntry);
    public abstract T remove(int givenPosition);
    public abstract boolean isFull();
    public abstract T getEntry(T anEntry);
    public abstract boolean isEmpty();
    public abstract void clear();
}
