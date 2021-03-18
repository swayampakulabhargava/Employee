/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 0817437
 */
public class EmployeeMain {
    
      public static void main(String[] args) {
        
     Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

     Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");

    Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");     
   
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
    }
    
}
