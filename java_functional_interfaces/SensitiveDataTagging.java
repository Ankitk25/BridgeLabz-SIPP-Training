
interface SensitiveData {}

class CustomerInfo implements SensitiveData {
    String name;
    String ssn;
    CustomerInfo(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        CustomerInfo c = new CustomerInfo("Rahul", "123-45-6789");
        if (c instanceof SensitiveData) {
            System.out.println("Customer data marked as sensitive. Needs encryption.");
        }
    }
}
