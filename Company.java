
package com.mycompany.companyproject;

import java.util.ArrayList;


public class Company {
    
    
    ArrayList<Person> persons;
    ArrayList<Product> products;
    ArrayList<Order> orders;
    
    public Company()
    {
        persons = new ArrayList();
        products = new ArrayList();
        orders = new ArrayList();
    }
    
    
    public void addProduct(Product product)
    {
        products.add(product);
    }
    
   
    public void addPerson(Person person)
    {
        persons.add(person);
    }
    
    
    public void addOrder(Order order)
    {
        orders.add(order);
    }
    
    
    public void removeProduct(int id)
    {
       
        for (Product product: products)
        {
           
            if (product.id == id)
            {
                products.remove(product);
                return;
            }
        }
        
        
        System.out.println("Product with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
    
    public void removePerson(int id)
    {
        
        for (Person person: persons)
        {
            
            if (person.id == id)
            {
                persons.remove(person);
                return;
            }
        }
        
        
        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
    
    public void removeOrder(int id)
    {
        
        for (Order order: orders)
        {
            
            if (order.id == id)
            {
                orders.remove(order);
                return;
            }
        }
        
        
        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
    
    public void printPersonInfo(int id)
    {
        
        for (Person person: persons)
        {
           
            if (person.id == id)
            {
                System.out.println("Person with id " + id + " info.");
                System.out.println("Name: " + person.name);
                System.out.println("Phone: " + person.phone);
                System.out.println("Gender: " + person.gender);
                
                
                if (person instanceof Client)
                {
                    System.out.println("Email: " + ((Client)person).email);
                }
                
                else if (person instanceof Employee)
                {
                    System.out.println("Salary: " + ((Employee)person).salary + "$");
                    System.out.println("Working time: " + ((Employee)person).workingTime);
                }
                
                
                System.out.println("----------------------");
                return;
            }
        }
        
        
        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
   
    public void printProductDetails(int id)
    {
       
        for (Product product: products)
        {
            
            if (product.id == id)
            {
                System.out.println("Product with id " + id + " details.");
                System.out.println("Name: " + product.name);
                System.out.println("Price: " + product.price + "$");
                System.out.println("----------------------");
                return;
            }
        }
        
        
        System.out.println("Product with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
    
    public void printOrderDetails(int id)
    {
        
        float totalSum = 0;
        
        
        for (Order order: orders)
        {
            
            if (order.id == id)
            {
                System.out.println("Order with id " + id + " details.");
                System.out.println("Date: " + order.date);
                System.out.println("Is paid: " + ((order.isPaid)? "yes": "no"));
                System.out.println("Ordered by: " + order.person.name );
                System.out.println("Products:");
                
                
                
                for (Product product: order.products)
                {
                    totalSum += product.price;
                    System.out.println("- " + product.name + ": " + product.price + "$");
                }
                
                
                System.out.println("Total: " + totalSum + "$");
                System.out.println("----------------------");
                return;
            }
        }
        
        
        System.out.println("Order with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
    
    public void printPersonOrders(int id)
    {
    
        for (Person person: persons)
        {
    
            if (person.id == id)
            {
                System.out.println("All orders made by person with id " + id + ":");
                
    
                for (Order order: orders)
                {
    
                    if (order.person.id == id)
                    {
                        System.out.println("> Order: #" + order.id);
                        System.out.println("  Date: " + order.date);
                        System.out.println("  Is paid: " + ((order.isPaid)? "yes": "no"));
                        System.out.println("  Ordered by: " + order.person.name );
                        System.out.println("  Products:");
                        
    
                        float totalSum = 0;
                        
    
    
                        for (Product product: order.products)
                        {
                            totalSum += product.price;
                            System.out.println("  - " + product.name + ": " + product.price + "$");
                        }
                        
    
                        System.out.println("  Total Price: " + totalSum + "$");
                    }
                }
                
    
                System.out.println("----------------------");
                return;
            }
        }
        
    
        System.out.println("Person with id " + id + " is not found!");
        System.out.println("----------------------");
    }
    
    
}
