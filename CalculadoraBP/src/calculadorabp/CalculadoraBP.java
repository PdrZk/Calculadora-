/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabp;

import javax.swing.JOptionPane;
public class CalculadoraBP {

   
    public static void main(String[] args) {
        String nu1 =
                JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        String nu2 =
                JOptionPane.showInputDialog("Digite o segundo número inteiro");
        
        float n1= Integer.parseInt (nu1);
        
        float n2= Integer.parseInt (nu2);
        int f = 0;
       while(f==0){
        String calc =
        JOptionPane.showInputDialog("Qual operação você deseja fazer ? [1]-Adição [2]-Subtração [3]-Multiplicação [4]-Divisão");
        float resp=0;
        switch(calc){
            case "1" :
               resp = n1+n2 ;
               f= 1;
            break;
            case "2" :
               resp = n1-n2 ;
               f=1;
            break;
            case"3" :
               resp = n1*n2;
               f=1;
            break;
            case"4" :
                resp = n1/n2;
                f=1;
            break;
            default:
                JOptionPane.showMessageDialog(null,"Operação inválida tente novamente");
                
                }
        if(f!=0){
        JOptionPane.showMessageDialog(null,"O resultado para seu cálculo foi:"+ resp);
        }
       
}
}
}
