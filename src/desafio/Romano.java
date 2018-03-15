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
     * @param num numero decimal para convertit
     * @return devuelve el valor en numero romano
     */
    public String decimalToRomano(int num){
        String valorDecimal = ""+num;
        String valorRomano = "";
        for (int i = valorRomano.length(); i > 0 ; i--) {
            String numero = valorDecimal.charAt(i)+"";
            switch(i){
                case 1:
                    valorRomano += valorToRomano1(numero);
                    break;
                case 2:
                    valorRomano += valorToRomano2(numero);
                    break;
                    
                case 3:
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor demasiado alto\n valor maximo admitido \"999\" se calculará apartir de las centenas el \nnumero introducido", ""
                            + "valor maximo excedido", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        return "";
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
    
    private String valorToRomano2(String num){
        
        return "";
    }
}
