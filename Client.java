/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.companyproject;

/**
 *
 * @author asoom
 */
public class Client extends Person {
    
    protected String email;
    
    public Client(String name, String phone, String gender, String email)
    {
        super(name, phone, gender);
        this.email = email;
    }
    
}
