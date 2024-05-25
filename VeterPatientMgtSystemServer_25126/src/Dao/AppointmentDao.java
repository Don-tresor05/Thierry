
package Dao;

import Model.Appointment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Thierry
 */
public class AppointmentDao {
    public Appointment registerAppointment(Appointment apObj){
           try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.save(apObj);
           tr.commit();
           ss.close();
           return apObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
        public Appointment updateAppointment(Appointment apObj){
           try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.update(apObj);
           tr.commit();
           ss.close();
           return apObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
            public Appointment deleteAppointment(Appointment apObj){
           try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Transaction tr = ss.beginTransaction();
           ss.delete(apObj);
           tr.commit();
           ss.close();
           return apObj;
       }catch(Exception e){
           e.printStackTrace();
       }
   return null;
   }
      public Appointment findByAppointmentById(Appointment apObj){
            try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           Appointment theAppointment = (Appointment) ss.get(Appointment.class, apObj.getPatient_id());
           ss.close();
           return theAppointment;
       }catch(Exception e){
           e.printStackTrace();
       }
       return null;
    }
      public List<Appointment> retrieveAllAppointment(){
          try{
           Session ss = HibernateUtil.getSessionFactory().openSession();
           List<Appointment> appointment = ss.createQuery("SELECT appointment FROM Appointment appointment").list();
           ss.close();
           return appointment;
       }catch(Exception e){
           e.printStackTrace();
       }
          return null;
      }
    
}
