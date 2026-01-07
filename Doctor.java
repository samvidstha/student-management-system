public class Doctor extends Person {

    private int doctorID;
    private String department;

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void seePatientDetails(Patient patient) {
        patient.viewPersonalDetails();
        System.out.println("Department: " + department);
    }

    public Treatment prescribeTreatment(String type, String description) {
        Treatment treatment = new Treatment();
        treatment.setType(type);
        treatment.setDescription(description);
        return treatment;
    }
}