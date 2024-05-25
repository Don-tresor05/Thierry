
package Dao;

import Model.MedicalRecord;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Thierry
 */
public class MedicalRecordDao {
   public MedicalRecord registerMedicalRecord(MedicalRecord medObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.save(medObj);
           tr.commit();
           ss.close();
           return medObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
   
      public MedicalRecord updateMedicalRecord(MedicalRecord medObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.update(medObj);
           tr.commit();
           ss.close();
           return medObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
         public MedicalRecord deleteMedicalRecord(MedicalRecord medObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.delete(medObj);
           tr.commit();
           ss.close();
           return medObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
         
    public MedicalRecord findMedicalRecordById(MedicalRecord medObj){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           MedicalRecord theMedicalRecord = (MedicalRecord) ss.get(MedicalRecord.class, medObj.getRecord_id());
           ss.close();
           return theMedicalRecord;
       }catch(Exception e){
           e.printStackTrace();
       }
       return null;
   }
    
   public List<MedicalRecord> retrieveAllMedicalRecord(){
       try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           List<MedicalRecord> medicalrecords = ss.createQuery("SELECT medicalrecord FROM MedicalRecord medicalrecord").list();
           ss.close();
           return medicalrecords;
       }catch(Exception e){
           e.printStackTrace();
       }
       return null;
   }
}
