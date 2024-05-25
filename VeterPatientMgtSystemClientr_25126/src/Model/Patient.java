
package Model;
import java.io.Serializable;

/**
 *
 * @author Thierry
 */
public class Patient implements Serializable{
    private Integer patientId;
    private String patientName;
    private String patientBreed;
    private Integer patientAge;
    private String patientOwner;
    private MedicalRecord theMedicalRecord;
    public Patient() {
    }

    public Patient(Integer patientId) {
        this.patientId = patientId;
    }

    public Patient(Integer patientId, String patientName, String patientBreed, Integer patientAge, String patientOwner, MedicalRecord theMedicalRecord) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientBreed = patientBreed;
        this.patientAge = patientAge;
        this.patientOwner = patientOwner;
        this.theMedicalRecord = theMedicalRecord;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientBreed() {
        return patientBreed;
    }

    public void setPatientBreed(String patientBreed) {
        this.patientBreed = patientBreed;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientOwner() {
        return patientOwner;
    }

    public void setPatientOwner(String patientOwner) {
        this.patientOwner = patientOwner;
    }

    public MedicalRecord getTheMedicalRecord() {
        return theMedicalRecord;
    }

    public void setTheMedicalRecord(MedicalRecord theMedicalRecord) {
        this.theMedicalRecord = theMedicalRecord;
    }

    
}
