public class Patient extends Person {

    private int patientID;

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getPatientID() {
        return patientID;
    }

    public Appointment bookAppointment(Doctor doctor, String date, String time) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentDate(date);
        appointment.setAppointmentTime(time);
        appointment.setPatient(this);
        appointment.setDoctor(doctor);
        return appointment;
    }
}