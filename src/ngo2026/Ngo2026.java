/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngo2026;

import oru.inf.InfDB; 
import oru.inf.InfException;

 
public class Ngo2026 {
    private static InfDB idb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            InfDB idb = new InfDB(
                "SDGSweden",
                "3306",
                "dbAdmin2024",
                "dbAdmin2024PW"
            );

            new inloggning(idb).setVisible(true);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
}