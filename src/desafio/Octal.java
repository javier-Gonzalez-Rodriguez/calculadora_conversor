/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author user
 */
public class Octal {
    private int num;
    
    /**
     * constructor de la clase
     * @param num numero a convertir
     */
    public Octal(int num) {
        this.num = num;
    }
    
    /**
     * convertimos el numero a octal
     * @return devuelve el numero en octal
     */
    public int decToOctal(){
        int num = 0;
        String numero = "";
        while(this.num != 0){
            numero = this.num%8+numero;
            this.num /= 8;
        }
        
        num = Integer.parseInt(numero);
        return num;
    }
    
    
    
}
