package HospitalPatientManagement;
import java.util.ArrayList;

public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private ArrayList<String> medicalHistory = new ArrayList<>();
    private String diagnosis;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected void addHistory(String record) {
        medicalHistory.add(record);
    }

    protected ArrayList<String> getMedicalHistory() {
        return medicalHistory;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

