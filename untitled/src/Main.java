import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        int choice = 0;

        while (choice != 7) {

            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. Show Patients");
            System.out.println("5. Show Doctors");
            System.out.println("6. Show Appointments");
            System.out.println("7. Exit");

            choice = input.nextInt();



            if (choice == 1) {

                System.out.print("Enter Patient ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Age: ");
                int age = input.nextInt();
                input.nextLine();

                System.out.print("Enter Disease: ");
                String disease = input.nextLine();

                Patient p = new Patient(id, name, age, disease);
                patients.add(p);

                System.out.println("Patient added successfully!");
            }
            else if (choice == 2) {

                System.out.print("Enter Doctor ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Specialization: ");
                String spec = input.nextLine();

                System.out.print("Enter Salary: ");
                double salary = input.nextDouble();

                Doctor d = new Doctor(id, name, spec, salary);
                doctors.add(d);

                System.out.println("Doctor added successfully!");
            }else if (choice == 3) {

                System.out.print("Enter Patient ID: ");
                int pId = input.nextInt();

                System.out.print("Enter Doctor ID: ");
                int dId = input.nextInt();
                input.nextLine();

                System.out.print("Enter Date: ");
                String date = input.nextLine();

                Patient foundPatient = null;
                Doctor foundDoctor = null;

                for (Patient p : patients) {
                    if (p.getId() == pId) {
                        foundPatient = p;
                        break;
                    }
                }for (Doctor d : doctors) {
                    if (d.getId() == dId) {
                        foundDoctor = d;
                        break;
                    }
                }if (foundPatient != null && foundDoctor != null) {
                    Appointment a = new Appointment(foundPatient, foundDoctor, date);
                    appointments.add(a);
                    System.out.println("Appointment booked successfully!");
                } else {
                    System.out.println("Patient or Doctor not found!");
                }
            }else if (choice == 4) {

                for (Patient p : patients) {
                    p.displayInfo();
                    System.out.println("-------------------");
                }
            }
            else if (choice == 5) {

                for (Doctor d : doctors) {
                    d.displayInfo();
                    System.out.println("-------------------");
                }
            }else if (choice == 6) {

                for (Appointment a : appointments) {
                    a.displayInfo();
                    System.out.println("-------------------");
                }
            }else if (choice == 7) {
                System.out.println("Goodbye!");
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}
