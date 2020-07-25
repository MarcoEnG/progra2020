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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // crear objeto si inicializar nada
        calculadora.establecerTipo("Calculadora Basica");
        
        Calculadora calculadora2= new Calculadora("Calculadora Basica"); // crea objeto inicializando recursos
        
        System.out.println("el resultado es: " + calculadora.sumar(10, 25));
        
        System.out.println("El atributo pblic es: " + calculadora.obtenerTipo());
    }
    
}
