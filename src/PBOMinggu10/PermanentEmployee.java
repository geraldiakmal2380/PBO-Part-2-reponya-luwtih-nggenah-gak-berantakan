package PBOMinggu10;

class PermanentEmployee extends Employee implements  Payable{
    private int salary;

    //konstruktor
    public PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    //override dari interface payable
    @Override
    public int getPaymentAmmount(){
        return (int)(salary+0.05*salary);//Ini dinamakan narrowing Casting
    }

    //Override dari class employee
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    }
}
