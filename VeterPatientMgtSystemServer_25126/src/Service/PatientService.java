
package Service;

import Model.Patient;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Thierry
 */
public interface PatientService extends Remote{
   
    Patient registerPatient(Patient thePatient) throws RemoteException;
    Patient updatePatient(Patient thePatient) throws RemoteException;
    Patient deletePatient(Patient thePatient) throws RemoteException;
    Patient SearchPatientById(Patient thePatient) throws RemoteException;
    List<Patient> findAll() throws RemoteException;
}
