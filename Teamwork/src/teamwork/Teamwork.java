/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamwork;

/**
 *
 * @author Student
 */
public class Teamwork {
    
    //funkce na kontrolu délky 10
        public static boolean zkontrolujDelku (String a) {
            boolean pom = true;
            if (a.length() != 10) {
                System.out.println("Chyba: nezadal jsi 10 číslic");
                pom = false;
            }
            return pom;
        }

    //převedení na pole longů s kontrolou, jsou-li to čísla    
        public static byte[] prevedNaPole (String a) {
            char [] poleCharu = a.toCharArray();
            byte [] aPole = new byte [11];
            aPole[10] = 1;  //délka pole je 10 + 11.člen nese info o kontrole
            for (int i=0; i<10; i++) {
                if (poleCharu[i]<'0' || poleCharu[i]>'9') {
                    System.out.println("Chyba: nezadal jsi 10 číslic");
                    aPole[10] = 0;
                } else {
                    aPole[i] = (byte) poleCharu[i];
                }
            return aPole;
            }
           
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String a = "";
        
   
        
    }
    
}
  