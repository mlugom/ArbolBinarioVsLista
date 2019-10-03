/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mlugom
 */
public class ArbolB <T extends Comparable<?super T>>{
    private NodoArbolB<T> root;

    public ArbolB(NodoArbolB<T> root) {
        this.root = root;
    }

    public ArbolB() {
        this.root = null;
    }
    
    public boolean isEmpty(){
        return this.root == null;
    }
    
    
}
