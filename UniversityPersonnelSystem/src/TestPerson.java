public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Student student = new Student("Jane Smith", Student.JUNIOR);
        Employee employee = new Employee("Bob Johnson", "Room 101", 50000, new MyDate(2020, 1, 1));
        Faculty faculty = new Faculty("Dr. Alice Brown", "Room 202", 80000, new MyDate(2010, 5, 15), "9am-5pm", "Professor");
        Staff staff = new Staff("Charlie Green", "Room 303", 40000, new MyDate(2015, 8, 20), "Secretary");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}