/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

import java.io.Serializable;

/**
 *
 * @author x16325901
 */
public class User implements Serializable {
    
    private String name;
    private String country;
    private String password;
    
    public User () {
        name = new String();
        country = new String();
        password = new String();
    }

    public User(String name, String country, String password) {
        this.name = name;
        this.country = country;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
}
