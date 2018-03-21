/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;

/**
 *
 * @author Poniente
 */
public class Binario {

    /**
     * constructor de la clase
     */
    public Binario() {
    }
    
    public String decimalToBinary(int numero){
        ArrayList<Integer> lista = new ArrayList();
        String conversion="";
        int num = numero;
        while(num != 0){
            lista.add(num%2);
            num/=2;
        }
        for (int i = lista.size()-1; i >= 0; i--) {
            conversion+=lista.get(i);
        }
        return conversion;
    }
    
    public int BinarioTodecimal(int num){
        String numero = ""+num;
        int nuevo_num = 0;
        int potencia = numero.length()-1;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '1') {
                
                nuevo_num += (Math.pow(2, (potencia-i)));
            }
        }
        return nuevo_num;
    }
}
