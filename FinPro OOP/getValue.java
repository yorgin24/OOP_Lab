/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinPro;

/**
 *
 * @author HP
 */
public class getValue {
    private int capacity;
    private int[] value;
    private int[] weight;
    
    public getValue(){
        
    }
    
    public void setCapVal(int cap){
        this.capacity = cap;
    }
    
    public void setValWei(int[] val, int[] wei){
        this.value = val;
        this.weight = wei;
    }
    
    public double getRealVal() {
        getIndex gmi = new getIndex(weight, value);
        double val = 0.0;
        for (int i = 0; i < weight.length; i++) {
            if (capacity == 0)
                return val;
            int index = gmi.setIndex();
            int a = Math.min(capacity, weight[index]);
            val += a * (double) value[index] / weight[index];
            weight[index] -= a;
            capacity -= a;
        }
        return val;
    }
}
