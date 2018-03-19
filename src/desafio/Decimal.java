/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Decimal {

    public Decimal() {
    }
    
    public String escritoTodecimal(String num){
        String nums[] = num.split(" ");
        String numero = "";
        for (int i = 0; i < nums.length; i++) {
            numero += conversionToEscrito(nums[i], i);
        }
        return num;
    }
    
    
    public int conversionToEscrito(String numero, int posicion){
        int solucion = 0;
        boolean num_esp = false;
        switch(posicion){
            case 1:
                if (false) {
                    switch(numero){
                        case "cero":
                            solucion = 0;
                            break;
                        case "uno":
                            solucion = 1;
                            break;
                        case "dos":
                            solucion = 2;
                            break;
                        case "tres":
                            solucion = 3;
                            break;
                        case "cuatro":
                            solucion = 4;
                            break;
                        case "cinco":
                            solucion = 5;
                            break;
                        case "seis":
                            solucion = 6;
                            break;
                        case "siete":
                            solucion = 7;
                            break;
                        case "ocho":
                            solucion = 8;
                            break;
                        case "nueve":
                            solucion = 9;
                            break;
                    }
                }
                break;
            case 2:
                switch(numero){
                    case "diez":
                        num_esp = true;
                        solucion = 10;
                        break;
                    case "once":
                        num_esp = true;
                        solucion = 11;
                        break;
                    case "doce":
                        num_esp = true;
                        solucion = 12;
                        break;
                    case "trece":
                        num_esp = true;
                        solucion = 13;
                        break;
                    case "catorce":
                        num_esp = true;
                        solucion = 14;
                        break;
                    case "quince":
                        num_esp = true;
                        solucion = 15;
                        break;
                    case "veinte":
                        solucion = 1;
                        break;
                    case "treinta":
                        solucion = 2;
                        break;
                    case "cuarenta":
                        solucion = 3;
                        break;
                    case "cincuenta":
                        solucion = 4;
                        break;
                    case "sesenta":
                        solucion = 5;
                        break;
                    case "setenta":
                        solucion = 6;
                        break;
                    case "ochenta":
                        solucion = 7;
                        break;
                    case "noventa":
                        solucion = 8;
                        break;
                    default:
                        solucion = numero_dos_digitos(numero);
                }
                break;
            case 3:
                switch(numero){
                        case "cien":
                            solucion = 1;
                            break;
                        case "doscientos":
                            solucion = 1;
                            break;
                        case "trescientos":
                            solucion = 2;
                            break;
                        case "cuatrocientos":
                            solucion = 3;
                            break;
                        case "quinientos":
                            solucion = 4;
                            break;
                        case "seiscientos":
                            solucion = 5;
                            break;
                        case "setecientos":
                            solucion = 6;
                            break;
                        case "ochocientos":
                            solucion = 7;
                            break;
                        case "novecientos":
                            solucion = 8;
                            break;
                        default:
                            solucion = num_tres_digitos(numero);
                    }
                break;
            case 4:
                switch(numero){
                    case "mil":
                        solucion = 1;
                        break;
                    case "dos-mil":
                        solucion = 1;
                        break;
                    case "tres-mil":
                        solucion = 2;
                        break;
                    case "cuatro-mil":
                        solucion = 3;
                        break;
                    case "cinco-mil":
                        solucion = 4;
                        break;
                    case "seis-mil":
                        solucion = 5;
                        break;
                    case "siete-mil":
                        solucion = 6;
                        break;
                    case "ocho-mil":
                        solucion = 7;
                        break;
                    case "nnueve-mil":
                        solucion = 8;
                        break;
                }
                break;
        }
        return solucion;
    }
    
    /**
     * si el numero de dos digitos no es el inicial ej 20 lo descompone 
     * @param num numero a descomponer
     * @return devuelve el numero que corresponda al string
     */
    private int numero_dos_digitos(String num){
        String num_nuevo = "";
        int solucion = 0;
        for (int i = 0; i < 3; i++) {
            num_nuevo += num.charAt(i);
        }
        switch(num_nuevo){
            case "die":
                solucion = 1;
            case "vei":
                solucion = 2;
                break;
            case "tre":
                solucion = 3;
                break;
            case "cua":
                solucion = 4;
                break;
            case "cin":
                solucion = 5;
                break;
            case "ses":
                solucion = 6;
                break;
            case "set":
                solucion = 7;
                break;
            case "och":
                solucion = 8;
                break;
            case "nov":
                solucion = 9;
                break;
        }
        return solucion;
    }
    
    /**
     * convierte los numeros de tres digitos no exactos
     * @param num numero a convertir 
     * @return devuelve el valor del numero
     */
    private int num_tres_digitos(String num){
        String num_nuevo = "";
        int solucion = 0;
        for (int i = 0; i < 3; i++) {
            num_nuevo += num.charAt(i);
        }
        switch(num_nuevo){
            case "cie":
                solucion = 1;
            case "dos":
                solucion = 2;
                break;
            case "tre":
                solucion = 3;
                break;
            case "cua":
                solucion = 4;
                break;
            case "qui":
                solucion = 5;
                break;
            case "sei":
                solucion = 6;
                break;
            case "set":
                solucion = 7;
                break;
            case "och":
                solucion = 8;
                break;
            case "nov":
                solucion = 9;
                break;
        }
        return solucion;
    }
}
