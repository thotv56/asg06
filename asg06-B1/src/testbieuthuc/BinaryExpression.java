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
abstract class BinaryExpression extends Expression{
    Expression left(){
        return ex;
    }
    abstract void right();
    
    @Override
    public int evaluate(){
        return left().evaluate();
    }
    @Override
    public String toString() {
        return ex.toString();
    }
}
