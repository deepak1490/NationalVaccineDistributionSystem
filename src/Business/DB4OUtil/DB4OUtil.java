package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.Cdc;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author Deepak
 */
public class DB4OUtil {

    private static final String FILENAME = "M:\\DataBank.db4o"; // path to the data store
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Cdc.class).cascadeOnUpdate(true);

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);

            return db;

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Cdc system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public Cdc retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<Cdc> systems = conn.query(Cdc.class); // Change to the object you want to save
        Cdc system;
        if (systems.size() == 0) {
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}