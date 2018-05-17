package management;


import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, int NInumber, double salary, String depName,double budget){
        super(name,NInumber,salary,depName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double payBonus(){

        double bonus;
        bonus = this.getSalary() * 0.02 ;
        return bonus;
    }

}
