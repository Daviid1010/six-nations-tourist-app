/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Davy Sheehy
 */
public class Calculator {

    private double ans;

    public Calculator() {
        ans = 0.0;
    }
    
    public double Divide (double num01, double num02) {
        ans = num01/num02;
        return ans;
    }
    
    public double Divide (int num01, double num02) {
        ans = num01/num02;
        return ans;
    }
}
