package BasicBifficulty;

public class Employee {
    private String fio;
    private int salary;
    private int department;
    private static int id;

    public Employee(String fio, int salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        id ++;
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

    public void setFio(String fio) {
        this.fio = fio;
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
