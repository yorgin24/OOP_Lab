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
public class getIndex {
    private int[] weight;
    private int[] value;
    
    
    public getIndex(){
        
    }
    
    public getIndex(int[] wei, int[] val){
        this.value = val;
        this.weight = wei;
    }
    
    public int setIndex() {
        int max_i = 0;
        double max = 0;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] != 0 && (double) value[i] / weight[i] > max) {
                max = (double) value[i] / weight[i];
                max_i = i;
            }
        }
        return max_i;
    }
}
