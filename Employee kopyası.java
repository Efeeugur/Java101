public class Employee{
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary < 100){
            return 0;
        }else{
            return salary * 0.3;
        }
    }

    public double bonus(){
        if(workHours > 40){
            return (workHours-40)*30;
        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        int year = 2021 - hireYear;
        if(year < 10){
            return salary * 1.05;
        }else if(year >= 10 && year < 20){
            return salary * 1.1;
        }else{
            return salary * 1.15;
        }
    }

    public String toString(){
        return "Name" + name + "\n" + 
               "Salary" + salary + "\n" +
               "workHourse" + workHours + "\n" +
               "hireYear" + hireYear + "\n" + 
               "Tax" + tax() + "\n" +
               "Bonus" + bonus() + "\n" +
               "Salary with raise" + raiseSalary();

    }
}