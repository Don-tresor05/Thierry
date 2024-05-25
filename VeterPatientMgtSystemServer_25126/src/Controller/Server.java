
package Controller;

import Service.implemention.AppointmentImpl;
import Service.implemention.MedicalRecordImpl;
import Service.implemention.PatientImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Thierry
 */
public class Server {
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("patient", new PatientImpl());
            registry.rebind("medicalrecord", new MedicalRecordImpl());
            registry.rebind("appointment", new AppointmentImpl());
            System.out.println("Server is running on port 5000 ");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
