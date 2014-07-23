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
interface  Expression {

   @Override
   public String toString();
   
   public abstract int evaluate();
}
