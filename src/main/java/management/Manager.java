package management;

import staff.Employee;

public class Manager extends Employee{

    String depName;

    public Manager(String name, int NInumber, double salary, String depName){

        super(name,NInumber,salary);
        this.depName = depName;
    }

    public String getDepName(){
        return this.depName;
    }
}

