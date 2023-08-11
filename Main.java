public class Main {
    public static void main(String[] args) {
        Contact contact=new Contact("qwerty", 765);
        Contact contact1=new Contact("asdf", 33);
        Contact contact2=new Contact("zxcv", 645789);
        Contact contact3=new Contact("poiu", 987654);

        Contact [] contacts={contact, contact1, contact2, contact3};
        Contact [] contacts1={contact,contact1, contact2};

        Phone phone=new Phone("Iphone", "14pro", 231, "lkjhg", contacts);
        Phone phone1=new Phone("MI", "WER", 876, "kmnjhgf",contacts1);

        System.out.println(phone.getPhoneUserName());
        System.out.println(phone.getContactCount(phone));
        phone.getAll();
        System.out.println(phone1.getPhoneUserName());
        System.out.println(phone1.getContact(phone1));
        phone1.getAll();

    }
}
