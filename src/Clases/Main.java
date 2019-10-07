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
public class Main {
    public static void main(String[] args) {
        ArbolB<Integer> miArbol = new ArbolB<>();
        ListaEncadenada<Integer> miLista = new ListaEncadenada<>();
        
        for (int i = 0; i < 1000000; i++) {
            int num = (int) Math.floor(Math.random()*1000000);
            miArbol.insert(num);
            miLista.pushBack(num);
        }
        
        int numero =57; //número que se va a probar
        
        long TinicioLista,TfinalLista,tiempoLista,TinicioArbol,TfinalArbol,tiempoArbol;
        TinicioLista = System.nanoTime();
        boolean respuestaLista = miLista.find(numero);
        System.out.println("La lista lo contiene: " + respuestaLista);
        TfinalLista = System.nanoTime();
        tiempoLista = TfinalLista-TinicioLista;
        System.out.println("Tiempo de ejecución de la lísta: " + tiempoLista);
        
        TinicioArbol = System.nanoTime();
        boolean respuestaArbol = miArbol.contains(numero);
        System.out.println("El árbol lo contiene: " + miArbol.contains(numero));
        TfinalArbol = System.nanoTime();
        tiempoArbol = TfinalArbol-TinicioArbol;
        System.out.println("Tiempo de ejecución del árbol: " + tiempoArbol);
    }
}
