public class Person {

    protected int personID;
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
    protected String contactDetails;

    public void viewPersonalDetails() {
        System.out.println("ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactDetails);
    }
}