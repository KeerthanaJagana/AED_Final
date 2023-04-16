/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author keerthanajagana
 */
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import Model.PS_Business;

public class dbUtils {
    private static dbUtils dbUtils;
    
    private dbUtils() {

    }


    public static dbUtils getInstance() {
         if (dbUtils == null) {
            dbUtils = new dbUtils();
        }
        return dbUtils; }

   
    

    private ObjectContainer createConnection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().objectClass(PS_Business.class).updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(PS_Business.class).cascadeOnUpdate(true);

        ObjectContainer db = Db4oEmbedded.openFile(config, "database/riverstone.db4o");
        return db;
    }

    public synchronized void storeSystem(PS_Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public PS_Business retrieveSystem() {
        try {
            ObjectContainer conn = createConnection();
            ObjectSet<PS_Business> systems = conn.query(PS_Business.class); // Change to the object you want to save
            PS_Business system;
            if (systems.isEmpty()) {
                system = PS_Business.createSystemAdmin();
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }
}
