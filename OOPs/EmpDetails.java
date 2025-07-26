class Employee extends Person{
    private int EmpId, StartedYear;
    private double Salary;
    private String InsuranceNumber;
    public void setEmpId(int empid){
        EmpId = empid;
    }

    public void setStartedYear(int year){
        StartedYear = year;
    }

    public void setSalary(double salary){
        Salary = salary;
    }

    public void setInsuranceNumber(String no){
        InsuranceNumber = no;
    }

    public int getEmpId(){
        return EmpId;
    }

    public int getStartedYear(){
        return StartedYear;
    }

    public double getSalary(){
        return Salary;
    }

    public String getInsuranceNumber(){
        return InsuranceNumber;
    }
}

public class EmpDetails{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Naruto");
        p.setAge(15);

        Employee e = new Employee();
        e.setName("Naruto Uzumaki");
        e.setAge(20);
        e.setEmpId(9493);
        e.setInsuranceNumber("A1542SETD2");
        e.setSalary(200000);
        e.setStartedYear(2018);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getEmpId());
        System.out.println(e.getInsuranceNumber());
        System.out.println(e.getSalary());
        System.out.println(e.getStartedYear());

        
    }
}
