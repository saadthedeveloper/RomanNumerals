/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.romannumerals;
import javax.swing.JOptionPane;
/**
 *
 */
public class RomanNumerals {

    public static void main(String[] args) {
        String input;
        int numberEnteredByUser;
        
        input = JOptionPane.showInputDialog("Enter any number from 1-10");
        numberEnteredByUser = Integer.parseInt(input);
        
        switch(numberEnteredByUser)
                {
                    case 1:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is I" );
                    break;
                   
                    case 2:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is II" );
                    break;
                    
                    case 3:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is III" );
                    break;
                   
                    case 4:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is IV" );
                    break;
                   
                    case 5:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is V" );
                    break;
                   
                    case 6:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is VI" );
                    break;
                   
                    case 7:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is VII" );
                    break;
                   
                    case 8:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is VIII" );
                    break;
                   
                    case 9:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is IX" );
                    break;
                  
                    case 10:
                        JOptionPane.showMessageDialog(null ,"Roman numeral for " + numberEnteredByUser + " is X" );
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null ,"Number entered is out of range specified" );
                          
                }
        
    }
}
