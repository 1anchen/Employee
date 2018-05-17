package staff;

public abstract class Employee {
    String name;
    int NInumber;
    double salary;
    double rate;


    public Employee(String name, int NInumber, double salary){
        this.name = name;
        this.NInumber=NInumber;
        this.salary=salary;
    }

    public void setName(String newName){
        if (newName != "" && newName != null){
            this.name = newName;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getNInumber(){
        return this.NInumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getRate(){
        return this.rate;
    }

    public boolean preventNegativeValue(double rate){

        if (rate > 0) {
            return true;
        }
        else{
            return false;
        }



    }

    public void raiseSalary(double rate){
        if(preventNegativeValue(rate)) {
             this.rate = this.salary * rate;
        }

    }
    public double payBonus(){
         double bonus;
         bonus = this.salary * 0.01 ;
         return bonus;
    }
}

