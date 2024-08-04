package bank.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Factory {

    private DAOFactory factory;
    private EmailFactory emailFactory;
    public Factory() {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        try {
            Properties prop = new Properties();
            // load the properties file
            prop.load(new FileInputStream(rootPath + "/config.properties"));
            // get the property value
            String environment = prop.getProperty("environment");
            if (environment.equals("production")) {
                factory= new ProductionFactory();
                emailFactory = new ProductionEmailFactory();
            } else if (environment.equals("test")) {
                factory= new MockFactory();
                emailFactory = new MockEmailFactory();
            } else {
                System.out.println("environment property not set correctly");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DAOFactory getDaoFactoryInstance() {
        return factory;
    }

    public EmailFactory getEmailFactoryInstance() {
        return emailFactory;
    }
}
