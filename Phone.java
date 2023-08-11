import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private int price;
    private String phoneUserName;

    private Contact [] contacts;

    public Phone(){

    }

    public Phone(String brand, String model, int price, String phoneUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phoneUserName = phoneUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoneUserName() {
        return phoneUserName;
    }

    public void setPhoneUserName(String phoneUserName) {
        this.phoneUserName = phoneUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getContactCount(Phone phone) {
        int sum=0;
        for(int i=0; i<contacts.length; i++){
            sum++;
        }
        return "lkjhg: " +sum;
    }

    public String getContact(Phone phone){
        int sum=0;
        for(int i=0; i<contacts.length; i++){
            sum++;
        }
        return "kmnjhgf: " +sum;
    }
    public void getAll(){
        for(int i=0; i<contacts.length; i++){
            System.out.println(contacts[i]+" ");
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", phoneUserName='" + phoneUserName + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
