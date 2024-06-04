
package com.mycompany.companyproject;


 abstract class Person {
    
    public int id;
    public String name;
    public String phone;
    public String gender;
    
    private static int idIncrementer = 0;
    
    public Person(String name, String phone, String gender)
    {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }
    

    
    
}
