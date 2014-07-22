/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.AbstractList;
import java.util.Vector;

/**
 *
 * @author Javier Bucaro
 */
public class StackVector<E> implements Stack<E> {
    protected Vector<E> data;
    protected boolean contenido;
    
    public StackVector(){
        data = new Vector();
        this.contenido = contenido;
    }
    
    public void push(E item){
        data.addElement(item);
    }
    
    public E pop(){
        return data.remove(size()-1);
    }
    
    public E peek(){
        return data.get(size()-1);
    }
    
    public int size(){
        return data.size();
    }
    
    public boolean empty(){
        if(data.isEmpty()){
            contenido = false;
        }
        else{
            contenido = true;
        }
        return contenido;
    }    
}
