
package Dao;

import Model.Patient;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Thierry
 */
public class PatientDao {
   public Patient registerPatient(Patient patObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.save(patObj);
           tr.commit();
           ss.close();
           return patObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
   public Patient updatePatient(Patient patObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.update(patObj);
           tr.commit();
           ss.close();
           return patObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
   public Patient deletePatient(Patient patObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.delete(patObj);
           tr.commit();
           ss.close();
           return patObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
   public Patient findPatientById(Patient patObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Patient thePatient = (Patient) ss.get(Patient.class, patObj.getPatientId());
           ss.close();
           return thePatient;
       }catch(Exception e){
           e.printStackTrace();
       }
       return null;
   }
   public List<Patient> retrieveAllPatient(){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           List<Patient> patients = ss.createQuery("SELECT patient FROM Patient patient").list();
           ss.close();
           return patients;
       }catch(Exception e){
           e.printStackTrace();
       }
       return null;
   }
}
