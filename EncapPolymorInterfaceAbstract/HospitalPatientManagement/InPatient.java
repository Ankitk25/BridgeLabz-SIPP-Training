package HospitalPatientManagement;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private double treatmentCost;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomChargePerDay, double treatmentCost) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public double calculateBill() {
        return (daysAdmitted * roomChargePerDay) + treatmentCost;
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
