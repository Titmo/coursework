package BasicBifficulty;

public class BasicMain {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.listEmployee();
        System.out.println("Сумма затрат на зарплаты в месяц:"+employeeBook.salaryCosts());
        System.out.println("Минимальная зарплата:"+employeeBook.minimumSalary());
        System.out.println("Максимальная зарплата:"+employeeBook.maximumSalary());
        System.out.println("Средняя зарплата:"+employeeBook.averageSalary());
        employeeBook.listFIO();
        //Повышенная сложность
        employeeBook.indexSalary();
        for (int i = 0; i <employeeBook.getStaff()[0].getCounter(); i++) {
            if (employeeBook.staff(i) != null) {
                System.out.println("Увелечение ЗП на 10%:" + employeeBook.getStaff()[i].getSalary());
            }
        }
        System.out.println("Минимальная зарплата по отделу:" + employeeBook.departmentMinimumSalary(1));
        System.out.println("Максимальная зарплата по отделу:" + employeeBook.departmentMaximumSalary(4));
        System.out.println("Средняя зарплата по отделу:" + employeeBook.departmentAverageSalary(2));
        employeeBook.departmentIndexSalary(3);
        employeeBook.departmentEmployees(5);
        employeeBook.salaryLess(100_000);
        System.out.println();
        employeeBook.salaryMore(100_000);
        System.out.println();
        employeeBook.deleteByFIO("Кузнецов П. С.");
        employeeBook.listEmployee();
        System.out.println();
        employeeBook.creatureByFIO("Киреев Д.Л.", 135_845, 2);
        employeeBook.listEmployee();
        System.out.println();
        employeeBook.changeAnEmployee("Киреев Д.Л.", 123_456, 3);
        employeeBook.listEmployee();
        System.out.println();
        employeeBook.employeesByDepartment();
    }
}

