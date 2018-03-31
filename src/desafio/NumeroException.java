/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author javier
 */
public class NumeroException extends Exception{

    /**
     * excepcion para los numeros mal introducidos 
     * @param message mensaje de error
     */
    public NumeroException(String message) {
        super(message);
    }
    
}
