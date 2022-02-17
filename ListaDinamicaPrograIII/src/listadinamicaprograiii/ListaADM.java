/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadinamicaprograiii;

import java.util.Collections;

/**
 *
 * @author godoy
 */
public class ListaADM {
      Miobjeto primero;//nulo 
    
   
    
    void agregar_pastel(String pastel) {
    
        if(primero==null)//primera vez
        { primero= new Miobjeto();
          primero.nombre=pastel;
        }
        else    // 2nda en adelante
        {
        
        
        Miobjeto pastel_aux = new Miobjeto();
        pastel_aux.nombre=pastel;
        
        if(primero.siguiente==null)
        primero.siguiente=pastel_aux;//es la 2nda vez
        else            //3 en adelante
        {
        /*int v[20];
        for(int i;i<20; i++)
            int iterador=v[20];*/
        Miobjeto iterador=primero.siguiente;//es el 2ndo vd
        boolean insertado=false;
        while(iterador!=null & insertado==false){
            
        if(iterador.siguiente!=null)
        {
             iterador=iterador.siguiente;
         
         
        }
        else{
       
        iterador.siguiente=pastel_aux;  
        insertado=true;
        
       
       Miobjeto pastel_aux2 = null;
       Miobjeto iterador2=primero.siguiente;
       boolean insertado2=false;
       while(iterador2!=null & insertado2==false){
            
       if(iterador2.siguiente!=null)
        {
         iterador2=iterador2.siguiente; 
        }
        else{
         iterador2.siguiente=pastel_aux2;  
         insertado2=true;
        }    
       }         
      }
     }
    }
   }
        }
        
      void eliminar_pastel( String pastel){
       Miobjeto actual= new Miobjeto();
       Miobjeto anterior= new Miobjeto();
       actual=primero;
       anterior=null;
       
       while(actual != null){
           if(actual.nombre == pastel){
               if(actual == primero.siguiente){
                   primero=primero.siguiente;
               }else{
                   anterior.siguiente=actual.siguiente;
               }
           }
           anterior =actual;
           actual=actual.siguiente;
       }
  }
  void imprimirnodo(String pastel){
  Miobjeto actual=new Miobjeto();
    
   actual=primero;
   if(primero.siguiente!= null){
       while(actual!= null){
          System.out.println(" EL pastel es: "+ actual.nombre);
           actual= actual.siguiente;
       }
   }else{
       actual= primero.siguiente;
     
       while(primero.siguiente != null){
           actual=actual.siguiente;
       }
   }

 
       
   
  }
 
  
  
 }
 
