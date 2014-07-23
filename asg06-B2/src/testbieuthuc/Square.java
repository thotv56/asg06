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
public class Square implements Expression{
    private Expression ex;
    public void setEx(Expression ex){
        this.ex = ex;
    }
    public Expression getEx(){
        return this.ex;          
    }
    
    public Square(Expression ex){
        this.ex = ex;
    }
    @Override
    public int evaluate(){
        return (ex.evaluate()*ex.evaluate());
    }

    @Override
    public String toString() {
        return "Square{" + "ex=" + ex.evaluate() + '}';
    }
 
}
