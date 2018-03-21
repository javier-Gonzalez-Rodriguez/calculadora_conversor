/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Decimal {

    public Decimal() {
    }

    public String decimalToEscrito(String valor) {
        String solucion = "";
        boolean cent = false;
        int numero = Integer.parseInt(valor);
        int digitos = valor.length();
        switch (digitos) {
            case 1:
                solucion = unDigito(numero);
                break;
            case 2:
                if (Integer.parseInt(valor.charAt(0) + "") == 1 || Integer.parseInt(valor.charAt(0) + "") == 2) {
                    if (Integer.parseInt(valor.charAt(0) + "") == 2) {
                        solucion = dosDigitosEsp2(20 + Integer.parseInt(valor.charAt(1) + ""));
                    } 
                    else{
                        solucion = dosDigitosEsp1(10 + Integer.parseInt(valor.charAt(1) + ""));
                    }

                } else {
                    solucion = dosDigitos(Integer.parseInt(valor.charAt(0) + ""));
                    if (Integer.parseInt(valor.charAt(1) + "") != 0) {
                        solucion += " y ";
                        solucion += unDigito(Integer.parseInt(valor.charAt(1) + ""));
                    }
                }
                break;
            case 3:
                solucion = tresDigitos(Integer.parseInt(valor.charAt(0)+""))+" ";
                if (Integer.parseInt(valor.charAt(1) + "") == 1 || Integer.parseInt(valor.charAt(1) + "") == 2) {
                    if (Integer.parseInt(valor.charAt(1) + "") == 2) {
                        solucion += dosDigitosEsp2(20 + Integer.parseInt(valor.charAt(2) + ""));
                    } 
                    else{
                        solucion += dosDigitosEsp1(10 + Integer.parseInt(valor.charAt(2) + ""));
                    }

                } else {
                    solucion += dosDigitos(Integer.parseInt(valor.charAt(1) + ""));
                    if (Integer.parseInt(valor.charAt(2) + "") != 0) {
                        solucion += " y ";
                        solucion += unDigito(Integer.parseInt(valor.charAt(2) + ""));
                    }
                }
                break;
            case 4:
               solucion = cuatroDigitos(Integer.parseInt(valor.charAt(0)+""))+" ";
               solucion += tresDigitos(Integer.parseInt(valor.charAt(1)+""))+" ";
                if (Integer.parseInt(valor.charAt(2) + "") == 1 || Integer.parseInt(valor.charAt(2) + "") == 2) {
                    if (Integer.parseInt(valor.charAt(2) + "") == 2) {
                        solucion += dosDigitosEsp2(20 + Integer.parseInt(valor.charAt(3) + ""));
                    } 
                    else{
                        solucion += dosDigitosEsp1(10 + Integer.parseInt(valor.charAt(3) + ""));
                    }

                } else {
                    solucion += dosDigitos(Integer.parseInt(valor.charAt(2) + ""));
                    if (Integer.parseInt(valor.charAt(3) + "") != 0) {
                        solucion += " y ";
                        solucion += unDigito(Integer.parseInt(valor.charAt(2) + ""));
                    }
                }
                break;
        }
        return solucion;
    }

    private String unDigito(int valor) {
        String solucion = "";
        switch (valor) {
            case 1:
                solucion = "uno";
                break;
            case 2:
                solucion = "dos";
                break;
            case 3:
                solucion = "tres";
                break;
            case 4:
                solucion = "cuatro";
                break;
            case 5:
                solucion = "cinco";
                break;
            case 6:
                solucion = "seis";
                break;
            case 7:
                solucion = "siete";
                break;
            case 8:
                solucion = "ocho";
                break;
            case 9:
                solucion = "nueve";
                break;
            case 0:
                solucion = "cero";
                break;
        }
        return solucion;
    }

    private String dosDigitosEsp1(int valor) {
        String solucion = "";
        switch (valor) {
            case 10:
                solucion = "diez";
                break;
            case 11:
                solucion = "once";
                break;
            case 12:
                solucion = "doce";
                break;
            case 13:
                solucion = "trece";
                break;
            case 14:
                solucion = "catorce";
                break;
            case 15:
                solucion = "quince";
                break;
            case 16:
                solucion = "dieciseis";
                break;
            case 17:
                solucion = "diecisitete";
                break;
            case 18:
                solucion = "dieciocho";
                break;
            case 19:
                solucion = "diecinueve";
                break;
        }
        return solucion;
    }

    private String dosDigitosEsp2(int valor){
        String solucion = "";
        switch (valor) {
            case 21:
                solucion = "veintiuno";
                break;
            case 22:
                solucion = "veintidos";
                break;
            case 23:
                solucion = "veintitres";
                break;
            case 24:
                solucion = "veinticuatro";
                break;
            case 25:
                solucion = "veinticinco";
                break;
            case 26:
                solucion = "veintiseis";
                break;
            case 27:
                solucion = "veintisiete";
                break;
            case 28:
                solucion = "veintiocho";
                break;
            case 29:
                solucion = "veintinueve";
                break;
            case 20:
                solucion = "veinte";
                break;
        }
        return solucion;
    }
    private String dosDigitos(int valor) {
        String solucion = "";
        switch (valor) {
            case 3:
                solucion = "treinta";
                break;
            case 4:
                solucion = "cuarenta";
                break;
            case 5:
                solucion = "cincuenta";
                break;
            case 6:
                solucion = "sesenta";
                break;
            case 7:
                solucion = "setenta";
                break;
            case 8:
                solucion = "ochenta";
                break;
            case 9:
                solucion = "noventa";
                break;
        }
        return solucion;
    }

    private String tresDigitos(int valor) {
        String solucion = "";
        switch (valor) {
            case 1:
                solucion = "cien";
                break;
            case 2:
                solucion = "doscientos";
                break;
            case 3:
                solucion = "trescientos";
                break;
            case 4:
                solucion = "cuatrocientos";
                break;
            case 5:
                solucion = "quinientos";
                break;
            case 6:
                solucion = "seiscientos";
                break;
            case 7:
                solucion = "setecientos";
                break;
            case 8:
                solucion = "ocheocientos";
                break;
            case 9:
                solucion = "novecientos";
                break;
        }
        return solucion;
    }

    private String cuatroDigitos(int valor) {
        String solucion = "";
        switch (valor) {
            case 1:
                solucion = "mil";
                break;
            case 2:
                solucion = "dos-mil";
                break;
            case 3:
                solucion = "tres-mil";
                break;
            case 4:
                solucion = "cuatro-mil";
                break;
            case 5:
                solucion = "cinco-mil";
                break;
            case 6:
                solucion = "seis-mil";
                break;
            case 7:
                solucion = "siete-mil";
                break;
            case 8:
                solucion = "ocho-mil";
                break;
            case 9:
                solucion = "nueve-mil";
                break;
        }
        return solucion;
    }
    
    public String escritoToDecimal(String valor){
        String solucion = "";
        String valores[] = valor.split(" ");
        solucion = convertir(valores);
        return solucion;
    }
    
    /**
     * hacemos una conversion a decimal
     * @param valores array de valores a convertir
     * @return devuelve el valor completo en decimal
     */
    private String convertir(String valores[]){
        int solucion = 0;
        for (int i = 0; i < valores.length; i++) {
            String valor = valores[i];
            switch (valor) {
                case "mil":
                    solucion += 1000;
                    break;
                case "dos-mil":
                    solucion += 2000;
                    break;
                case "tres-mil":
                    solucion += 3000;
                    break;
                case "cuatro-mil":
                    solucion += 4000;
                    break;
                case "cinco-mil":
                    solucion += 5000;
                    break;
                case "seis-mil":
                    solucion += 6000;
                    break;
                case "siete-mil":
                    solucion += 7000;
                    break;
                case "ocho-mil":
                    solucion += 8000;
                    break;
                case "nueve-mil":
                    solucion += 9000;
                    break;
                case "cien":
                    solucion += 100;
                    break;
                case "doscientos":
                    solucion += 200;
                    break;
                case "trescientos":
                    solucion += 300;
                    break;
                case "cuatrocientos":
                    solucion += 400;
                    break;
                case "quinientos":
                    solucion += 500;
                    break;
                case "seiscientos":
                    solucion += 600;
                    break;
                case "setecientos":
                    solucion += 700;
                    break;
                case "ocheocientos":
                    solucion += 800;
                    break;
                case "novecientos":
                    solucion += 900;
                    break;
                case "treinta":
                    solucion += 30;
                    break;
                case "cuarenta":
                    solucion += 40;
                    break;
                case "cincuenta":
                    solucion += 50;
                    break;
                case "sesenta":
                    solucion += 60;
                    break;
                case "setenta":
                    solucion += 70;
                    break;
                case "ochenta":
                    solucion += 80;
                    break;
                case "noventa":
                    solucion += 90;
                    break;
                case "veintiuno":
                    solucion += 21;
                    break;
                case "veintidos":
                    solucion += 22;
                    break;
                case "veintitres":
                    solucion += 23;
                    break;
                case "veinticuatro":
                    solucion += 24;
                    break;
                case "veinticinco":
                    solucion += 25;
                    break;
                case "veintiseis":
                    solucion += 26;
                    break;
                case "veintisiete":
                    solucion += 27;
                    break;
                case "veintiocho":
                    solucion += 28;
                    break;
                case "veintinueve":
                    solucion += 29;
                    break;
                case "veinte":
                    solucion += 20;
                    break;
                case "diez":
                    solucion += 10;
                    break;
                case "once":
                    solucion += 11;
                    break;
                case "doce":
                    solucion += 12;
                    break;
                case "trece":
                    solucion += 13;
                    break;
                case "catorce":
                    solucion += 14;
                    break;
                case "quince":
                    solucion += 15;
                    break;
                case "dieciseis":
                    solucion += 16;
                    break;
                case "diecisitete":
                    solucion += 17;
                    break;
                case "dieciocho":
                    solucion += 18;
                    break;
                case "diecinueve":
                    solucion += 19;
                    break;
                case "uno":
                    solucion += 1;
                    break;
                case "dos":
                    solucion += 2;
                    break;
                case "tres":
                    solucion += 3;
                    break;
                case "cuatro":
                    solucion += 4;
                    break;
                case "cinco":
                    solucion += 5;
                    break;
                case "seis":
                    solucion += 6;
                    break;
                case "siete":
                    solucion += 7;
                    break;
                case "ocho":
                    solucion += 8;
                    break;
                case "nueve":
                    solucion += 9;
                    break;
                case "cero":
                    solucion += 0;
                    break;
            }
        }
        return solucion+"";
    }
}
