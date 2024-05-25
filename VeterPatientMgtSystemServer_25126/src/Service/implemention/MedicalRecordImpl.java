 
package Service.implemention;

import Dao.MedicalRecordDao;
import Model.MedicalRecord;
import Service.MedicalRecordService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Thierry
 */
public class MedicalRecordImpl extends UnicastRemoteObject implements MedicalRecordService{
    public MedicalRecordImpl() throws RemoteException{
        super();
    }
    private MedicalRecordDao dao = new MedicalRecordDao ();

    @Override
    public MedicalRecord registerMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
        return dao.registerMedicalRecord(theMedicalRecord);
      
    }

    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
       return dao.updateMedicalRecord(theMedicalRecord);
    }

    @Override
    public MedicalRecord deleteMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
        return dao.deleteMedicalRecord(theMedicalRecord);
    }

    @Override
    public MedicalRecord SearchMedicalRecordById(MedicalRecord theMedicalRecord) throws RemoteException {
      return dao.findMedicalRecordById(theMedicalRecord);
    }

    @Override
    public List<MedicalRecord> findAll() throws RemoteException {
       return dao.retrieveAllMedicalRecord();
    }
    
    
}
