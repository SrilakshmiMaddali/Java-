/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Encapsulation is binding the class variables with methods such as getters and setters.
 * That is making the variables private and providing the getter and setter methods to modify and read them.
 * @author srilakshmimaddali
 */
public class EncapsulationEg {
    public static void main(String[] args) {
        Employ e1 = new Employ();
        e1.setEmpid(101);
        e1.setEmpname("Srilakshmi");
        System.out.println(e1.getEmpid());
        System.out.println(e1.getEmpname());
    }
    
}

class Employ{
    private int empid;//Private class variables only accessed inside this class
    private String empname;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
    
}