/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;

/**
 *
 * @author Poniente
 */
public class Binario {
    private int num;

    /**
     * constructor de la clase
     * @param num numero a convertir
     */
    public Binario(double num) {
        this.num =(int) num;
    }
    
    public String decimalToBinary(){
        ArrayList<Integer> lista = new ArrayList();
        String conversion="";
        int num = this.num;
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
        int contador = 0;
        for (int i = numero.length(); i > 0; i--) {
            nuevo_num += (Integer.parseInt(numero.charAt(i)+"")*Math.pow(2, contador));
            contador++;
        }
        return nuevo_num;
    }
}
