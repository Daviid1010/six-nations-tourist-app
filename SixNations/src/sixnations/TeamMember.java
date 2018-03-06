/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

import java.io.Serializable;

/**
 *
 * @author Davy Sheehy
 */
public class TeamMember implements Serializable{
    protected String name;
    protected int age;
    protected String country;



    public TeamMember(String name,int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
