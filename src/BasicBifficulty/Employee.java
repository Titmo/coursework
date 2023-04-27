package BasicBifficulty;

public class Employee {
    private final String fio;
    private int salary;
    private int department;
    private static int counter=0;
    private final int id;


    public Employee(String fio, int salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        counter++;
        this.id = getCounter();
    }

    public String getFio() {
        return fio;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "Ф.И.О:" + fio + " Отдел:" + department + " ЗП:" + salary;
    }

    public int getId() {
        return id;
    }

}
