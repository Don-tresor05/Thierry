
package Model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Thierry
 */
public class MedicalRecord implements Serializable {
    private Integer Record_id;
    private String diagnosis;
    private String treatment;
    private Date date;
    private Patient thePatient;

    public MedicalRecord() {
    }

    public MedicalRecord(Integer Record_id) {
        this.Record_id = Record_id;
    }
    

    public MedicalRecord(Integer Record_id, String diagnosis, String treatment, Date date, Patient thePatient) {
        this.Record_id = Record_id;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
        this.thePatient = thePatient;
    }

    public Integer getRecord_id() {
        return Record_id;
    }

    public void setRecord_id(Integer Record_id) {
        this.Record_id = Record_id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getThePatient() {
        return thePatient;
    }

    public void setThePatient(Patient thePatient) {
        this.thePatient = thePatient;
    }

  

    
}
