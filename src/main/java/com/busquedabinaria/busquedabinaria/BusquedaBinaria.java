/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.busquedabinaria.busquedabinaria;

/**
 *
 * @author fabia
 */
public class BusquedaBinaria {


    
    public static int BusquedaBinaria(int [] NUMERO, int dato){ 
        int inicio, fin, mitad;
        inicio= 0;
        fin= NUMERO.length -1;
        
        
        while(inicio <= fin  ){
            mitad= (inicio + fin )/2;
            if(NUMERO[mitad]==dato){
                return mitad;
            }else if (NUMERO[mitad] < dato) {
                inicio= mitad+1;
                
            }else {
                fin = mitad -1;
            }
            
        }
        return -1; 
        
    }
    public static void main(String[] args) {
        int NUMERO[]= {1,2,3,4,5,6,7,8,9,10,11,12};
        int posicion= BusquedaBinaria(NUMERO, 6);
        if(posicion== -1){
            System.out.println("EL DATO NO SE ENCUENTRA  ");
            
            
        }else{
            System.out.println("SE ENCONTRO EL DATO EN LA POSICION "+posicion );
             
        }
        
        
    
    }
            
}