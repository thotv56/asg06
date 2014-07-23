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
class Numeral implements Expression{
    public Numeral(int va){
        this.value = va;       
    }
    private int value;
    public void setValue(int va){
        this.value = va;
    }
    public int getValue(){
        return this.value;
    }
    @Override
    public int evaluate(){
        return this.value;
    }

    @Override
    public String toString() {
        return "Numeral{" + "value=" + value + '}';
    }

}
