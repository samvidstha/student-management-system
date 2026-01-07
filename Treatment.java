public class Treatment {

    private static int nextID = 1; 

    private int treatmentID;
    private String type;
    private String description;

    public Treatment() {
        this.treatmentID = nextID++;
    }

    public int getTreatmentID() {
        return treatmentID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void viewTreatmentDetails() {
        System.out.println("Treatment ID: " + treatmentID);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
    }
}