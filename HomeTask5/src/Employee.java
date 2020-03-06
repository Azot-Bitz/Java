import java.util.ArrayList;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    public int age;
    private Object Employee;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this.name = "Andrew Petrov";
        this.position = "Policeman";
        this.email = "petr000@yandex.ru";
        this.phoneNumber = "89076548900";
        this.salary = 50000;
        this.age = 35;
    }

    public Object getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
     Object info(){
        ArrayList<Object> employee1 = new ArrayList<>();
        employee1.add(name);
        employee1.add(position);
        employee1.add(email);
        employee1.add(phoneNumber);
        employee1.add(salary);
        employee1.add(age);
       return employee1;
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
//        System.out.println(emp1.getName());
//        System.out.println(emp1.getPosition());
//        System.out.println(emp1.getEmail());
//        System.out.println(emp1.getPhoneNumber());
//        System.out.println(emp1.getSalary());
//        System.out.println(emp1.getAge());
        System.out.println(emp1.info());
        Employee [] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Vasily Kulikov", "Engeneer", "vaska345@mail.ru",
                "89095674323", 45000, 27);
        employeeArray[1] = new Employee("Dmitry Vaskov", "Courier", "vbasd222@mail.ru",
                "89076788766", 25000, 22);
        employeeArray[2] = new Employee("Andrew Sokolov", "Director", "boss54@gmail.com",
                "89567890000", 80000, 45);
        employeeArray[3] = new Employee("Aleksandr Petrov", "Manager", "masdok@mail.ru",
                "89659005432", 50000, 42);
        employeeArray[4] = new Employee("Dmitri Agravenon", "Manager", "reason1111@mail.ru",
                "89096544555", 60000, 32);
        for(int i = 0; i < employeeArray.length; i++){
            if(employeeArray[i].age > 40){
                System.out.println(employeeArray[i].name);
            }
        }
    }
}

