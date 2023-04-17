package BasicBifficulty;


public class EmployeeBook {
    private Employee[] staff = new Employee[10];
    private Employee[] staffer=new Employee[1];

    public EmployeeBook() {
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
    }
    public Employee staff(int i) {
        staffer[0]=staff[i];
        return staffer[0];
    }

    public Employee[] getStaff() {

        return staff;
    }
    public void listEmployee() {
        for (int i = 0; i <staff.length; i++) {
            if (staff(i)!=null) {
                System.out.println(this.staff[i].toString());
            }

        }
    }

    public int salaryCosts() {
        int salaryCosts=0;
        for  (int i = 0; i <staff.length; i++) {
            if (staff(i)!=null) {
                salaryCosts = salaryCosts + staff[i].getSalary();
            }
        }
        return salaryCosts;
    }
    public int minimumSalary() {
        int min=staff[0].getSalary();
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getSalary() < min) {
                    min = staff[i].getSalary();
                }
            }
        }
        return min;
    }
    public int maximumSalary() {
        int max=staff[0].getSalary();
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getSalary() > max) {
                    max = staff[i].getSalary();
                }
            }
        }
        return max;
    }

    public int averageSalary() {
        int salaryCosts=0;
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                salaryCosts = salaryCosts + staff[i].getSalary();
            }
        }
        return salaryCosts/staff.length;
    }
    public void listFIO() {
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                System.out.println(staff[i].getFio());
            }
        }
    }
    //Повышенная сложность
    public void indexSalary() {
        int salary;
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                salary = staff[i].getSalary();
                staff[i].setSalary((int) (salary+(salary *0.1F)));
            }
        }
    }

    public int departmentMinimumSalary(int department) {
        int min = 0;
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    min = staff[i].getSalary();
                }
            }
        }
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    if (staff[i].getDepartment() < min) {
                        min = staff[i].getSalary();
                    }
                }
            }
        }
        return min;
    }
    public int departmentMaximumSalary(int department) {
        int max = 0;
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    max = staff[i].getSalary();
                }
            }
        }
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    if (staff[i].getDepartment() > max) {
                        max = staff[i].getSalary();
                    }
                }
            }
        }
        return max;
    }

    public int departmentAverageSalary(int department) {
        int salaryCosts=0;
        int quantity=0;
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    quantity++;
                    salaryCosts = salaryCosts + staff[i].getSalary();
                }
            }
        }
        return salaryCosts/quantity;
    }

    public void departmentIndexSalary( int department) {
        int salary;
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    salary = staff[i].getSalary();
                    staff[i].setSalary((int) (salary + (salary * 0.1F)));
                }
            }
        }
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    System.out.println("Увелечение ЗП на 10% по отделу:" + staff[i].getSalary());
                }
            }
        }
    }

    public void departmentEmployees( int department) {
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment() == department) {
                    System.out.println("ф.И.О. " + staff[i].getFio() + " ЗП:" + staff[i].getSalary());
                }
            }
        }
    }

    public void salaryLess( int limit) {
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getSalary() < limit) {
                    System.out.println("id " + staff[i].getId() + " ФИО:" + staff[i].getFio() + " ЗП:" + staff[i].getSalary());
                }
            }
        }
    }
    public void salaryMore( int limit) {
        for (int i = 0; i <staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getSalary() > limit) {
                    System.out.println("id " + staff[i].getId() + " ФИО:" + staff[i].getFio() + " ЗП:" + staff[i].getSalary());
                }
            }
        }
    }
    public void creatureByFIO(String fio, int salary, int department) {
        for (int i = 0; i < staff.length; i++) {
            if (staff(i) == null) {
                staff[i] = new Employee(fio, salary, department);
                break;
            }
        }
    }

    public void deleteByFIO(String fio) {
        for (int i = 0; i < staff.length ; i++) {
            if (staff(i) != null) {
                if (staff[i].getFio().equals(fio)) {
                    staff[i]=null;
                }
            }
        }
    }

    public void changeAnEmployee(String fio, int salary, int department) {
        int count=0;
        for (int i = 0; i < staff.length ; i++) {
            if (staff(i) != null) {
                if (staff[i].getFio().equals(fio)) {
                    staff[i].setSalary(salary);
                    staff[i].setDepartment(department);
                    break;
                } else {
                    count++;
                }
            }
        }
        if (count == staff.length) {
            System.out.println("Такого сотрудника нет");
        }
    }
    public void employeesByDepartment() {
        System.out.println("Отдел 1");
        for (int i = 0; i < staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment()==1)
                    System.out.println("Ф.И.О:"+staff[i].getFio());
            }
        }
        System.out.println("Отдел 2");
        for (int i = 0; i < staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment()==2)
                    System.out.println("Ф.И.О:"+staff[i].getFio());
            }
        }
        System.out.println("Отдел 3");
        for (int i = 0; i < staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment()==3)
                    System.out.println("Ф.И.О:"+staff[i].getFio());
            }
        }
        System.out.println("Отдел 4");
        for (int i = 0; i < staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment()==4)
                    System.out.println("Ф.И.О:"+staff[i].getFio());
            }
        }
        System.out.println("Отдел 5");
        for (int i = 0; i < staff.length; i++) {
            if (staff(i) != null) {
                if (staff[i].getDepartment()==5)
                    System.out.println("Ф.И.О:"+staff[i].getFio());
            }
        }
    }

}


