/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_progra2;

/**
 *
 * @author Marco
 */
public class Calculadora { //Nombre de la clase se inicia en Mayuscula y en singular
    private int resultadoEntero; //atributos de clase
    private double resultadoDecimal;//atributos de clase
    private String tipoCalculadora;
 
    //constructor: implicito y explicito
    //sobre carga de constructores
    public Calculadora(){
    };
    
    public Calculadora(String tipo){
            this.tipoCalculadora=tipo;
            }
    
    public void mensaje(){ //nombre del metodo es en minuscula y en singular
         
    }
    
    //alcance de una variable
    //sobre carga de metoso:parametros, tipo de datos
    //refactorizacion
    public int sumar(int primerNumero, int segundoNumero){
        this.resultadoEntero = primerNumero + segundoNumero; 
        return resultadoEntero;
    }
    
    
    public int obtenerResultadoEntero(){
    return this.resultadoEntero;
    }
    
    public String obtenerTipo(){
    return this.tipoCalculadora;
    }
    
    //setType
    public void establecerTipo(String tipo){
    this.tipoCalculadora=tipo;
    }
    
   
    //sobrecarga por cantidad de parametros
    public int sumar(int primerNumero, int segundoNumero, int tercerNumero){
    return 0;
    
    }
    
    public double sumar(double primerNumero, double segundoNumero){ //sobrecarga de metodos, cambia los parametros y tipo de datos
     double resultado = primerNumero + segundoNumero;
        return resultado;
    }
   
    
   public String mensaje2(){
      return "Hola Mundo";
   } 
    
}
