
package Model;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.*;

/**
 *
 * @author Thierry
 */
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date; 
    private Time time;
    private Integer patient_id;
    private String Appointment_purpose;

    public Appointment() {
    }

    public Appointment(Integer id, Date date, Time time, Integer patient_id, String Appointment_purpose) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.patient_id = patient_id;
        this.Appointment_purpose = Appointment_purpose;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Integer getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Integer patient_id) {
        this.patient_id = patient_id;
    }

    public String getAppointment_purpose() {
        return Appointment_purpose;
    }

    public void setAppointment_purpose(String Appointment_purpose) {
        this.Appointment_purpose = Appointment_purpose;
    }




}
