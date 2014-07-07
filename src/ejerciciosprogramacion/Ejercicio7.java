/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @authora : Luisa Holguin
 */
public class Ejercicio7 {
     public static void main(String[] args) 
     { 
      int bandera=0;
      String Luisa= " ";
      int l = 0;
      int numero=0,c=0;
      JOptionPane.showMessageDialog(null," EJERCICIO 7 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
      while (bandera==0) {
        int codigo;
        char x;
        String res="";
        String Cadena1, aux;
        Cadena1=JOptionPane.showInputDialog("Ingrese su Frase");
        int longitud1 = Cadena1.length();    
        char [] frase1= Cadena1.toCharArray();    
        for (int i = 0; i < longitud1; i++)
        {
            if (Cadena1.codePointAt(i)>=65 && Cadena1.codePointAt(i)<=90)
            {
                codigo = Cadena1.codePointAt(i);
                codigo =codigo+32;
                x=(char)codigo; 
                res=res+x;                    
            }
            else                  
            {
                res=res+frase1[i];                    
            }          
        }
        JOptionPane.showMessageDialog(null,res);
        Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
        l = Integer.parseInt(Luisa);
        if (l==1)  
            bandera=1;                        
        }       
        JOptionPane.showMessageDialog(null," Fin del ejercicio 7 ");  
    }
}

