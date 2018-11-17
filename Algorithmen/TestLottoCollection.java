/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithmen;

/**
 *
 * @author Mutz
 */
public class TestLottoCollection {
    public static void main(String[] args){
      
        LottoCollection lotto = new LottoCollection();
       
        lotto.ziehen(6,49);
        lotto.ausgeben();
        lotto.ziehen(5,35);
        lotto.ausgeben();        
   }
}
