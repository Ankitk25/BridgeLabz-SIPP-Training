package HospitalPatientManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("P101", "Alice", 30, 5, 2000, 5000);
        p1.setDiagnosis("Pneumonia");
        p1.addRecord("Admitted with high fever");
        p1.addRecord("Antibiotic course for 5 days");

        OutPatient p2 = new OutPatient("P102", "Bob", 45, 800, 1200);
        p2.setDiagnosis("Back Pain");
        p2.addRecord("Consulted for chronic back pain");
        p2.addRecord("Prescribed physiotherapy");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord record) {
                record.viewRecords();
            }

            System.out.println("----------------------------");
        }
    }
}
