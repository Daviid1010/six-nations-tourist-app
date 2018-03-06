/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;


/**
 *
 * @author Davy Sheehy
 */
public class Manager extends TeamMember {
    
    private int wins;
    private int losses;
    private int draws;

    public Manager(String name, int age, String country) {
        super(name, age, country);
    }
    
    

    public Manager(int wins, int losses, int draws, int age, String country, String name) {
        super(name, age, country);
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
    
    public String getInfo(String name,int age,String country,int wins, int losses, int draws) {
        String info;
        info = "Name: " + name + "\nAge: " + age + "\nNationality: " + country + "\nWins: " + wins + "\nLosses: " + losses + "\nDraws: " + draws;
        return info;
    }

}
