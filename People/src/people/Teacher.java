/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;

/*
Create a teacher class inside that you will have a name, a salary, a school name and an array of 5 grades
Then you are going to create an array teachers (3 teachers) and you will create a loop through each and display name, school and salary
*/

/**
 *
 * @author Davy Sheehy
 */
public class Teacher implements Serializable {
    private String name;
    private String schoolName;
    private double salary;
        
    
    
    public Teacher(){
        name= new String();
        schoolName = new String();
        salary=0.0;
    }

    public Teacher(String name, String schoolName, double salary) {
        this.name = name;
        this.schoolName = schoolName;
        this.salary = salary;
    }
    
    
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
    
}
