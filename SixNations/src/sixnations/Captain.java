/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

/**
 *
 * @author x16440304
 */
public class Captain extends TeamMember {
    private int caps;
    private String club;

    public Captain(String name,int age,String country, int caps, String club) {
        super(name,age,country);
        this.caps = caps;
        this.club = club;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
    
    public String getInfo(String name,int age,String country, int caps, String club) {
        String info;
        info = "Name: " + name + "\n Age: "+ age +"\nCountry: "+ country +"\nCaps: " + caps + "\nCub: " + club;
        return info;
    }
    
    
    
}
