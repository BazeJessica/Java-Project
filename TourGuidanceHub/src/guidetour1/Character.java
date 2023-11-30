/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidetour1;

/**
 *
 * @author gabriel
 */
public class Character {
    // declare attributs
    protected String name;
    protected String gender;
    protected int age;
    protected String nationality;
    public Character(String name){
        this.name = name;
     }
    
    public Character(){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        
    }
    public Character(String name,String nationality,String gender, int age){
        this.name=name;
        this.nationality = nationality;
        this.gender= gender;
        this.age = age;
        introduceYourself();
    }
    
    // acces to attributs
    public String getGender(){
        return gender;   
    }
    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    
    public int getAge(){
        return age;
    }
    
    // modify age 
    public void setAge(int age){
       this.age=age;
    }
    
    
   
    
    
    //public Personnality (String nationality){
    //    this.nationality=nationality;
    //   introduceYourself();
    //}
    
    //public String getNationality(){
    //    return this.nationality;
    //}
        
   
    
    
    public void introduceYourself(){
        System.out.println (" Hello, I'm a "+ nationality + ", " + gender + "and I'm " +age+  " years old.");
    }
    
    
}


    

