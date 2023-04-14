package BasicBifficulty;

public class BasicMain {
    public static void main(String[] args) {
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Чернов Д.И.", 135_845, 2);
        staff[1] = new Employee("Григорьев М. Д.", 118_702, 3);
        staff[2] = new Employee("Беляев Д. А.", 66_132, 4);
        staff[3] = new Employee("Александров А. И.", 82_077, 4);
        staff[4] = new Employee("Савина М. С.", 64_450, 5);
        staff[5] = new Employee("Голубев А. А.", 224_679, 1);
        staff[6] = new Employee("Белоусова Е. И.", 221_751, 2);
        staff[7] = new Employee("Бычков Д. А.", 81_302, 1);
        staff[8] = new Employee("Кузнецов П. С.", 131_841, 5);
        staff[9] = new Employee("Комарова Е. И.", 180_025, 3);
        listEmployee(staff);
        System.out.println("Суммa затрат на зарплаты в месяц:"+salaryCosts(staff));
        System.out.println("Минимальная зарплата:"+minimumSalary(staff));
        System.out.println("Максимальная зарплата:"+maximumSalary(staff));
        System.out.println("Средняя зарплата:"+averageSalary(staff));
        listFIO(staff);
    }
    public static void listEmployee(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee.toString());
        }
    }
    public static int salaryCosts(Employee[] staff) {
        int salaryCosts=0;
        for (Employee employee : staff) {
            salaryCosts = salaryCosts + employee.getSalary();
        }
        return salaryCosts;
    }
    public static int minimumSalary(Employee[] staff) {
        int min=staff[0].getSalary();
        for (Employee employee : staff) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }
    public static int maximumSalary(Employee[] staff) {
        int max=staff[0].getSalary();
        for (Employee employee : staff) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public static int averageSalary(Employee[] staff) {
        int salaryCosts=0;
        for (Employee employee : staff) {
            salaryCosts = salaryCosts + employee.getSalary();
        }
        return salaryCosts/Employee.id;
    }
    public static void listFIO(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee.getFio());
        }
    }
}
