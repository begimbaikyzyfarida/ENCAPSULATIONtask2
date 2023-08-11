public class Contact {
    private String contactName;

    private int contactNumber;

    public Contact(String contactName, int contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "contactName='" + contactName + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
