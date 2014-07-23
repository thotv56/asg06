/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testbieuthuc;

/**
 *
 * @author GRU-PC
 */
public class Expression {
    Expression ex = new Expression();
    @Override
    public String toString() {
        return ""+ex.evaluate();
    }
    public int evaluate(){
        return 9;
    }
}
