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
public abstract class BinaryExpression implements Expression{
    Expression left(Expression ex){
        return ex;
    }
    abstract void right();
    
    @Override
    public int evaluate(){
        return evaluate();
    }

    @Override
    public String toString() {
        return "BinaryExpression{" + '}';
    }



}
