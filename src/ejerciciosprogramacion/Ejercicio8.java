/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane ;
/**
 *
 * @authora : Luisa Holguin
 */
public class Ejercicio8 {
     public static void main(String[] args) 
      {
        int c=0;
        String Cadena1;
        int bandera=0;
        String Luisa= " ";
        int v = 0;
        JOptionPane.showMessageDialog(null," EJERCICIO 8 " , " Ejercicios de Programacion ", JOptionPane.INFORMATION_MESSAGE);
        while (bandera==0) {
        Cadena1=JOptionPane.showInputDialog("Ingrese una Frase");
        Cadena1=" "+ Cadena1;         
        char[] frase1 =Cadena1.toCharArray();        
        for (int i = 0; i< Cadena1.length() ; i++)
        {
            if (frase1[i]=='A'||frase1[i]=='a') 
            {
                c=c+1;
                for (int j = i; j < Cadena1.length(); j++) 
                {
                    if (frase1[j]==' ') 
                    {
                      i=j;
                      j=Cadena1.length();                      
                    }   
                }                
            }            
        }        
        System.out.println(Cadena1);
        JOptionPane.showMessageDialog(null,"Hay "+c+ " caracteres que tiene/n la letra a");
        Luisa = JOptionPane.showInputDialog("Desea continuar ingresando de nuevo otros valores SI=0 , NO=1 ");
        v = Integer.parseInt(Luisa);
        if (v==1)  
            bandera=1;                        
        }       
        JOptionPane.showMessageDialog(null," Fin del ejercicio 8 "); 
    }
}
