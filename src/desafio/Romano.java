/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import javax.swing.JOptionPane;

/**
 *
 * @author Poniente
 */
public class Romano {

    public Romano() {
    }
    /**
     * convertimos el valor decimal a romano
     * @param num numero decimal para convertir
     * @return devuelve el valor en numero romano
     */
    public String decimalToRomano(int num){
        String valorDecimal = ""+num;
        String valorRomano = "";
        int longitud = valorDecimal.length();
        switch(longitud){
            case 1:
                valorRomano = valorToRomano1(valorDecimal);
                break;
            case 2:
                valorRomano = valorToRomano2(valorDecimal.charAt(0)+"");
                valorRomano += valorToRomano1(valorDecimal.charAt(1)+"");
                break;
            case 3:
                valorRomano = valorToRomano3(valorDecimal.charAt(0)+"");
                valorRomano += valorToRomano2(valorDecimal.charAt(1)+"");
                valorRomano += valorToRomano1(valorDecimal.charAt(2)+"");
                break;
        }
        return valorRomano;
    }
    
    /**
     * valor de una sola unidad
     * @param valor valor decimal a convertir
     * @return devuelve el valor en romano
     */
    private String valorToRomano1(String valor){
        String solucion = "";
        switch(valor){
            case "1":
                solucion = "I";
                break;
            case "2":
                solucion = "II";
                break;
            case "3":
                solucion = "III";
                break;
            case "4":
                solucion = "IIII";
                break;
            case "5":
                solucion = "V";
                break;
            case "6":
                solucion = "VI";
                break;
            case "7":
                solucion = "VII";
                break;
            case "8":
                solucion = "VIII";
                break;
            case "9":
                solucion = "VIIII";
                break;
        }
        return solucion;
    }
    
    /**
     * valor de la decena
     * @param valor numero que contiene la decena
     * @return devuelve el valor en romano
     */
    private String valorToRomano2(String valor){
        String solucion = "";
        switch(valor){
            case "1":
                solucion = "X";
                break;
            case "2":
                solucion = "XX";
                break;
            case "3":
                solucion = "XXX";
                break;
            case "4":
                solucion = "XXXX";
                break;
            case "5":
                solucion = "L";
                break;
            case "6":
                solucion = "LX";
                break;
            case "7":
                solucion = "LXX";
                break;
            case "8":
                solucion = "LXXX";
                break;
            case "9":
                solucion = "LXXXX";
                break;
        }
        return solucion;
    }
    
    /**
     * ponemos el valor de la centena 
     * @param valor numero a convertir 
     * @return devuelve el numero comvertido
     */
    private String valorToRomano3(String valor){  
        String solucion = "";
        switch(valor){
            case "1":
                solucion = "C";
                break;
            case "2":
                solucion = "CC";
                break;
            case "3":
                solucion = "CCC";
                break;
            case "4":
                solucion = "CCCC";
                break;
            case "5":
                solucion = "D";
                break;
            case "6":
                solucion = "DC";
                break;
            case "7":
                solucion = "DCC";
                break;
            case "8":
                solucion = "DCCC";
                break;
            case "9":
                solucion = "DCCCC";
                break;
        }
        return solucion;
    }
    
    /**
     * convertimos de romano a decimal
     * @param numero numero que vamos a convertir
     * @return devuelve el numero convertido
     */
    public int RomanoToDecimal(String numero){
        int numero_decimal = 0;
        for (int i = 0; i < numero.length(); i++) {
            String num = numero.charAt(i)+"";
            switch(num){
                case "I":
                    numero_decimal += 1;
                    break;
                case "V":
                    numero_decimal += 5;
                    break;
                case "X":
                    numero_decimal += 10;
                    break;
                case "L":
                    numero_decimal += 50;
                    break;
                case "C":
                    numero_decimal += 100;
                    break;
                case "D":
                    numero_decimal += 500;
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Valor demasiado alto\n valor maximo admitido \"DCCCCLXXXXVIIII(999)\" se calculará apartir de las centenas el \nnumero introducido", ""
                            + "valor maximo excedido", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        return numero_decimal;
    }
}
