/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exsete;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float base;
        float altura;
        float area;
        
        System.out.println("Digite a base do quadrado");
        base = entrada.nextFloat();
        System.out.println("Digite a altura do quadrado");
        altura = entrada.nextFloat();
        area = base*altura;
        System.out.println("A area do quadrado é: "+" "+area);
    }
    
}
