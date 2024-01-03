/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*aqui se coloca directamente ya que el metodo obtenerMultiplicacion tiene
         void y eso indica que no retorna ningun valor*/
        obtenerMultiplicacion(7,50);
        /*aqui se coloca que el valor del metodo obtenerMultiplicacionDos se le 
        asigne a una variable String miMensaje ya que retorna en una variable 
        de tipo String*/
        String miMensaje = obtenerMultiplicacionDos(7,50);
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miMensaje);
    }
    
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        int resultado=0;
        String cadena="";
        for(tabla=1;tabla<=limite;tabla++){
            for(int i=1;i<=limite;i++){
                resultado=tabla*i;
                cadena=String.format("%s%dx%d=%d\n"
                        ,cadena,
                        tabla,i
                          , resultado);
            }
        }
        System.out.printf("%s",cadena);
    }
    public static String obtenerMultiplicacionDos(int tabla, int limite){
        
        String cadena="";
        for(tabla=1;tabla<=limite;tabla++){
            for(int i=1;i<=limite;i++){
                int resultado=tabla*i;
                cadena=String.format("%s%dx%d=%d\n"
                        ,cadena,
                        tabla,i
                          , resultado);
            }
        }
        return cadena;
    }
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}
