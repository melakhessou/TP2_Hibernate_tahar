/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vue.FenTP;

/**
 *
 * @author Administrateur
 */
public class AppCtr {
    
    public static void main(String[]args){
     FenTP fen = new FenTP();
     fen.setVisible(true);
     fen.setTitle("Gestion des employés");
     fen.remplirCombLoc();
    
}}
