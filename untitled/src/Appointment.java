public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void displayInfo() {
        System.out.println("Appointment Date: " + date);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor ID: " + doctor.getId());
    }
}