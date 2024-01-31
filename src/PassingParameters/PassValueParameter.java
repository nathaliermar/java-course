package PassingParameters;

public class PassValueParameter {

    public static void main(String[] args) {

        Contact contact = new Contact("Contact 1", "123-4567", "contact1@email.com");
        int value = 10;

        System.out.println(contact);
        System.out.println(value);

        testPassValueReference(value, contact);

        System.out.println(contact);
        System.out.println(value);

        testPassValueReference2(value, contact);

        System.out.println(contact);
        System.out.println(value);
    }

    private static void testPassValueReference(int value, Contact contact) {

        int newValue = value + 10;
        value = newValue;

        contact = new Contact("Contact 2", "2345-6789", "contact2@email.com");
    }

    private static void testPassValueReference2(int value, Contact contact) {

        int newValue = value + 10;
        value = newValue;

        contact.setName("Contact" + newValue);
    }
}
