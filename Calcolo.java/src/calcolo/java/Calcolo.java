/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolo.java;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author falsetti.francesco
 */
public class Calcolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b, h;
        Scanner tastiera = new Scanner(System.in);

        b = Integer.parseInt(JOptionPane.showInputDialog("Inserire la base"));
        h = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'altezza"));

        System.out.println("Area: " + calcolo(b, h, 'a'));
        System.out.println("Perimetro: " + calcolo(b, h, 'p'));

    }

    public static int calcolo(int b, int h, char c) {

        //se mettiamo l'istruzione break
        //il compilatore si accorge del dead code
        
        switch (c) {
            case 'p':
                return 2 * (b + h); //break
            case 'a':
                return b * h; //break
            default:
                return 0; //break
                
        }
    }
}
