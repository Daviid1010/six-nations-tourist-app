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
public class Person {
    protected String name;
    protected int age;
    protected String dob;
    protected double salary;
    
    public Person (String name,int age,String dob, double salary) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getName () {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
