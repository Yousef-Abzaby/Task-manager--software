public class Doctor {
    public int id;
    public String name;
    public String specialization;
    public double salary;


public Doctor(int id, String name, String specialization, double salary) {
    this.id = id;
    this.name = name;
    this.specialization = specialization;
    this.salary = salary;
}public int getId() {
        return id;}
        public void displayInfo() {
            System.out.println("Doctor ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Specialization: " + specialization);
            System.out.println("Salary: " + salary);
        }}
