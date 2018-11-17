/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

/**
 *
 * @author mutz
 */
public class Flasche implements Zerstörbar{

    @Override
    public void zerstöre() {
        System.out.println("Flasche wurde zerstört!");
    }
    
}
