package HospitalPatientManagement;
public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double testCharges;

    public OutPatient(String patientId, String name, int age, double consultationFee, double testCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }

    @Override
    public void addRecord(String record) {
        addHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History:");
        for (String r : getMedicalHistory()) {
            System.out.println(" - " + r);
        }
    }
}
