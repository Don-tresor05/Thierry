
package Service.implemention;

import Dao.AppointmentDao;
import Model.Appointment;
import Service.AppointmentService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Thierry
 */
public class AppointmentImpl extends UnicastRemoteObject implements AppointmentService{
    public AppointmentImpl() throws RemoteException{
        super();
    }
     private AppointmentDao dao = new AppointmentDao (); 
    @Override
    public Appointment registerAppointment(Appointment theAppointment) throws RemoteException {
      return dao.registerAppointment(theAppointment);
    }

    @Override
    public Appointment updateAppointment(Appointment theAppointment) throws RemoteException {
        return dao.updateAppointment(theAppointment);
    }

    @Override
    public Appointment deleteAppointment(Appointment theAppointment) throws RemoteException {
      return dao.deleteAppointment(theAppointment);
    }

    @Override
    public Appointment SearchAppointmentById(Appointment theAppointment) throws RemoteException {
        return dao.findByAppointmentById(theAppointment);
    }

    @Override
    public List<Appointment> findAll() throws RemoteException {
      return dao.retrieveAllAppointment();
    }
    
    
}
