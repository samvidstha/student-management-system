public class Appointment {

    private static int nextID = 1; 

    private int appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private Patient patient;
    private Doctor doctor;

    public Appointment() {
        this.appointmentID = nextID++;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void viewAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
        System.out.println("Patient: " + patient.name);
        System.out.println("Doctor: " + doctor.name);
    }

    public void rescheduleAppointment(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
    }

    public void cancelAppointment() {
        System.out.println("Appointment cancelled.");
    }
}