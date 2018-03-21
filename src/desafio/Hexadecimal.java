/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Hexadecimal {
    
    /**
     * constructor de la clase 
     * @param num valor a convertir
     */
    public Hexadecimal() {
    }
    
    /**
     * conversion de hexadecimal a numero
     * @param hexadecimal numero en hexadecimal para convertir
     * @return devuelve el valor en decimal
     */
    public int HexToDecimal(String hexadecimal){
        int num = 0;
        int potencia = hexadecimal.length()-1;
        for (int i = 0; i < hexadecimal.length(); i++) {
            num+=(Integer.parseInt(conversionHex(hexadecimal.charAt(i)))*(Math.pow(16, potencia-i)));
        }
        return num;
    }
    /**
     * conversion de los valores de A a F en hexadecimal a decimal
     * @param num n letra a convertir en decimal
     * @return devuelve el valor de la letra
     */
    public String conversionHex(char num){
        String solucion = "";
        switch(num){
            case 'A':
                solucion = "10";
                break;
            case 'B':
                solucion = "11";
                break;
            case 'C':
                solucion = "12";
                break;
            case 'D':
                solucion = "13";
                break;
            case 'E':
                solucion = "14";
                break;
            case 'F':
                solucion = "10";
                break;
            default:
                solucion = num+"";
                break;
        }
        return solucion;
    }
    
    /**
     * convertimos decimal a hexadecimal
     * @return devolvemos el numero en hexadecimal
     */
    public String decimalToHex(int numero){
        ArrayList<Integer> lista = new ArrayList();
        String resultado ="";
        int num = numero;
        while(num != 0){
            lista.add(num%16);
            num/=16;
        }
        for (int i = lista.size()-1; i >= 0; i--) {
            resultado+= caracteresHex(lista.get(i));
        }
        return resultado;
    }
    
    /**
     * convertimos los valores en decimal a hexadecimal
     * @param num numero en decimal
     * @return devuelve el numero en hexadecimal
     */
    private String caracteresHex(int num){
        String resultado ="";
        switch(num){
            case 10:
                resultado = "A";
                break;
            case 11:
                resultado = "B";
                break;
            case 12:
                resultado = "C";
                break;
            case 13:
                resultado = "D";
                break;
            case 14:
                resultado = "E";
                break;
            case 15:
                resultado = "F";
                break;
            default:
                resultado += num;
                break;
        }
        return resultado;
    }    
}
