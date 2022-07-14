package SalaryCalculator;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours,  int hireYear){
        this.hireYear = hireYear;
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }

    public double tax() {
        if (this.salary < 1000) {
            System.out.println("Vergi uygulanmamaktadır.");
        } else {
            return this.salary * 0.03;
        }
        return 0;
    }

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        double increase;
        int difference;
        if (this.hireYear <= 0 || this.hireYear > 2021) {
            System.out.println("Geçersiz çalışma yılı girdiniz!");
        } else {
            difference = 2021 - this.hireYear;

        if (difference>0 && difference < 10) {
            increase = this.salary * 0.05;
            return increase;
        } else if (difference > 9 && difference < 20) {
            increase = this.salary * 0.10;
            return increase;
        } else if (difference > 19) {
            increase = this.salary * 0.15;
            return increase;
        } else {
            increase = 0;
        }
        }
        return 0;
    }


    public void toStringEmployee(){

        double taxSalary= this.salary + bonus() - tax();
        double totalSalary = this.salary + bonus() + raiseSalary() - tax();
        int difference = 2021 - this.hireYear;
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
        System.out.println("Work Hours = " + this.workHours);
        System.out.println("Hire Year = " + this.hireYear);
        System.out.println("Years of work: "+ difference);
        System.out.println("Tax = " + tax());
        System.out.println("Bonus = " + bonus());
        System.out.println("Salary Raise " + raiseSalary());
        System.out.println("Salary with Tax and Bonus : " + taxSalary);
        System.out.println("Total Salary : " + totalSalary);
    }
}
