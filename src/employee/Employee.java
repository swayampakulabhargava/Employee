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
public class Employee {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department= "";
        this.position= "";
        
    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position=" + position + '}';
    }
    
    
}
