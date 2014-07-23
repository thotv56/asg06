/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testbieuthuc;


abstract class Addition extends BinaryExpression{
    Expression left;
    Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression getEx() {
        return ex;
    }

    public void setEx(Expression ex) {
        this.ex = ex;
    }
    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public int evaluate(){
        return (left.evaluate()+right.evaluate());
    }
    @Override
    public String toString() {
        return ""+evaluate();
    }
}
