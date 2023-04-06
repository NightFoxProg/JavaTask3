public class Employee extends Object {
    private final String name;
    private final String surname;
    private final String position;
    private final String email;
    private final int age;
    private final int phone;


    public Employee(String name, String surname, String position, String email, int age, int phone) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }
}
