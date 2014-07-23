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
public class Multiplication extends Addition{

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int evaluate(){
        return left.evaluate()*right.evaluate();
    }

    @Override
    public String toString() {
        return ""+evaluate();
    }
    
}
