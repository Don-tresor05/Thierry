
package Service;

import Model.Appointment;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Thierry
 */
public interface AppointmentService extends Remote{
    Appointment registerAppointment(Appointment theAppointment)throws RemoteException;
    Appointment updateAppointment(Appointment theAppointment)throws RemoteException;
    Appointment deleteAppointment(Appointment theAppointment) throws RemoteException;
    Appointment SearchAppointmentById(Appointment theAppointment)throws RemoteException;
    List<Appointment> findAll () throws RemoteException;
    
    
}
