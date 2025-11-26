package PBOMinggu10;

class InternshipEmployee extends Employee {
    private int length;

    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += "Registered as Internship for"+length +" month/s\n";
        return info;
    }
}
