/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;


/**
 *
 * @author Andres
 */
public class Logica {
    
    public Logica() {
    }
    
    public boolean validaCI(String CI){
        int suma = 0;
        
        if(CI.length()!=10){
            //JOptionPane.showMessageDialog(null,"Cédula Erronea");
            return false;
        }else{
            int a[]= new int[CI.length()/2];
            int b[]= new int[CI.length()/2];
            int c=0;
            int d=1;
            int aux=0;
         
            for (int i = 0; i < CI.length()/2; i++) {
                a[i]= Integer.parseInt(String.valueOf(CI.charAt(c)));
                c+=2;
                if (i<(CI.length()/2)-1) {
                    b[i]=Integer.parseInt(String.valueOf(CI.charAt(d)));
                    d+=2;
                }
            }
            for (int i = 0; i < a.length; i++) {
                a[i]=a[i]*2;
                if (a[i]>9) {
                    a[i]=a[i]-9;
                }
                b[i]=b[i]*1;
                if (b[i]>9) {
                    b[i]=b[i]-9;
                }
                
                suma=suma+a[i]+b[i];
                
            }
            aux = (suma / 10 + 1) * 10;
            if ((aux-suma)== Integer.parseInt(String.valueOf(CI.charAt(CI.length()-1)))) {
                return true;
            } else if (suma%10==0 && CI.charAt(CI.length()-1)=='0') {
                return true;
            }else{
                return false;
            }
        }    
    }
    
    public void validaNumero(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if ((c>=48 && c<=57)) {
        }else{
            evt.consume();
        }
    }
    
    public void validaMayusculas(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c >= 65 && c <= 87)) {
        } else {
            evt.consume();
        }
    }
}

