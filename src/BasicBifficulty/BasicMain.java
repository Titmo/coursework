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
        System.out.println("Сумма затрат на зарплаты в месяц:"+salaryCosts(staff));
        System.out.println("Минимальная зарплата:"+minimumSalary(staff));
        System.out.println("Максимальная зарплата:"+maximumSalary(staff));
        System.out.println("Средняя зарплата:"+averageSalary(staff));
        listFIO(staff);
        //Повышенная сложность
        indexSalary(staff);
        for (Employee employee : staff) {
            System.out.println("Увелечение ЗП на 10%:"+employee.getSalary());
        }
        System.out.println("Минимальная зарплата по отделу:" + departmentMinimumSalary(staff, 1));
        System.out.println("Максимальная зарплата по отделу:" + departmentMaximumSalary(staff, 4));
        System.out.println("Средняя зарплата по отделу:" + departmentAverageSalary(staff, 2));
        departmentIndexSalary(staff,3);
        departmentEmployees(staff,5);
        salaryLess(staff,100_000);
        System.out.println();
        salaryMore(staff,100_000);


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
        return salaryCosts/staff.length;
    }
    public static void listFIO(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee.getFio());
        }
    }
    //Повышенная сложность
    public static void indexSalary(Employee[] staff) {
        int salary;
        for (Employee employee : staff) {
            salary = employee.getSalary();
            employee.setSalary((int) (salary+(salary *0.1F)));
        }
    }

    public static int departmentMinimumSalary(Employee[] staff,int department) {
        int min = 0;
        for (Employee value : staff) {
            if (value.getDepartment() == department) {
                min = value.getSalary();
            }
        }
        for (Employee employee : staff) {
            if (employee.getDepartment() == department) {
                if (employee.getDepartment() < min) {
                    min = employee.getSalary();
                }
            }
        }
        return min;
    }
    public static int departmentMaximumSalary(Employee[] staff,int department) {
        int max = 0;
        for (Employee value : staff) {
            if (value.getDepartment() == department) {
                max = value.getSalary();
            }
        }
        for (Employee employee : staff) {
            if (employee.getDepartment() == department) {
                if (employee.getDepartment() > max) {
                    max = employee.getSalary();
                }
            }
        }
        return max;
    }

    public static int departmentAverageSalary(Employee[] staff,int department) {
        int salaryCosts=0;
        int quantity=0;
        for (Employee employee : staff) {
            if (employee.getDepartment() == department) {
                quantity++;
                salaryCosts = salaryCosts + employee.getSalary();
            }
        }
        return salaryCosts/quantity;
    }

    public static void departmentIndexSalary(Employee[] staff, int department) {
        int salary;
        for (Employee employee : staff) {
            if (employee.getDepartment() == department) {
                salary = employee.getSalary();
                employee.setSalary((int) (salary+(salary *0.1F)));
            }
        }
        for (Employee employee : staff) {
            if (employee.getDepartment() == department) {
                System.out.println("Увелечение ЗП на 10% по отделу:"+employee.getSalary());
            }
        }
    }

    public static void departmentEmployees(Employee[] staff, int department) {
        for (Employee employee : staff) {
            if (employee.getDepartment() == department) {
                System.out.println("ф.И.О. "+employee.getFio() + " ЗП:" + employee.getSalary());
            }
        }
    }

    public static void salaryLess(Employee[] staff, int limit) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() < limit) {
                System.out.println("id " + i + " ФИО:" + staff[i].getFio() + " ЗП:" + staff[i].getSalary());
            }
        }
    }
    public static void salaryMore(Employee[] staff, int limit) {
        int id = 0;
        for (Employee employee : staff) {
            id++;
            if (employee.getSalary() > limit) {
                System.out.println("id " + (id) + " ФИО:" + employee.getFio() + " ЗП:" + employee.getSalary());
            }
        }
    }

}
