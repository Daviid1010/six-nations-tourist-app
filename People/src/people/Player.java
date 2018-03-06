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
public class Player {
    private String name;
    private int age;
    private int caps;
    private String province;
    
    public Player () {
        
    }
    
    public Player (String name, int age, int caps, String province) {
        this.name = name;
        this.age = age;
        this.caps = caps;
        this.province =  province;
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

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    
    
}
