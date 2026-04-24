package Metodo;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcularNotas {
 
    public String Desenvolvimento(int valor) {
        int[] numeros = {100,50,20,10,5,2,1};
        StringBuilder resultado = new StringBuilder();
        
        for(int numero : numeros) {
            int quantidade = valor / numero;
            if( quantidade > 0) {
                resultado.append(quantidade)
                            .append(" notas(s) de ")
                            .append(numero)
                            .append("\n");
                     valor %= numero;       
            }
        }
        
        return resultado.toString();
    }
}
