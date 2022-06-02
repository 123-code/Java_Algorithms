package javaapplication1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author cisco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static int leerentero(String texto,int min,int max){
        Scanner ingreso = new Scanner(System.in);
        int dato = 0;
        
        do{
            System.out.println(texto + " entre " + min + " y " + max);
            dato = ingreso.nextInt();
        }while(dato < min || dato > max);
        return dato;
    }
    
    public static int factorial(int numero){
        // caso base
        if(numero==1){
            return 1;
        }
        
        else{
            //caso general
            return numero*factorial(numero-1);
        }

    }
    
    public static void imprimir(ArrayList info,int indice){
        if(indice != info.size()){
            System.out.println("El factorial de " + info.get(indice) + " es " + factorial((int)info.get(indice)));
            imprimir(info,++indice);
            
        }

    } 
    
    
    public static int sumatoria(ArrayList info,int indice){
        if(indice == info.size()){
             return 0;
        }
        
        else{
            return (int)info.get(indice) + sumatoria(info,++indice);
            
        }
        
        /*
        if(indice == info.size()){
            return 0;
        }
        
        else{
          
           sumatoria(info,indice+1);
            return suma +(int)info.get(indice);
          
        }
         return suma;
*/
    }
    

    public static void main(String[] args) {
        // ejercicio recursividad
        ArrayList<Integer> lista = new ArrayList<Integer>();

         int num = leerentero("Cuantos Datos desea ingresar? ",1,20);
    
       int dato;        
    for(int i=0;i<num;i++){
    dato = leerentero("ingrese un numero ",1,12);
    lista.add(dato);
        
        System.out.println("///////");
   imprimir(lista,0);
         System.out.println("La sumatoria es:" + sumatoria(lista,0));
        
        
    }
 
}
}