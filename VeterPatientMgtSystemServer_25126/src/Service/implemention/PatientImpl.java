
package Service.implemention;

import Dao.PatientDao;
import Model.Patient;
import Service.PatientService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Thierry
 */
public class PatientImpl extends UnicastRemoteObject implements PatientService{

    public PatientImpl()throws RemoteException{
        super();
    }
    private PatientDao dao = new PatientDao();
    @Override
    public Patient registerPatient(Patient thePatient) throws RemoteException {
        return dao.registerPatient(thePatient);
    }

    @Override
    public Patient updatePatient(Patient thePatient) throws RemoteException {
       return dao.updatePatient(thePatient);
    }

    @Override
    public Patient deletePatient(Patient thePatient) throws RemoteException {
        return dao.deletePatient(thePatient);
    }

    @Override
    public Patient SearchPatientById(Patient thePatient) throws RemoteException {
        return dao.findPatientById(thePatient);
    }

    @Override
    public List<Patient> findAll() throws RemoteException {
        return dao.retrieveAllPatient();
    }
    
}
