
package Service;

import Model.MedicalRecord;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Thierry
 */
public interface MedicalRecordService extends Remote{
    MedicalRecord registerMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException;
    MedicalRecord updateMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException;
    MedicalRecord deleteMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException;
    MedicalRecord SearchMedicalRecordById(MedicalRecord theMedicalRecord) throws RemoteException;
    List<MedicalRecord> findAll () throws RemoteException;
            
    
}
