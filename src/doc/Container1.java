package doc;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class Container1 {

    public static void main(String[] args) {

        try {


            Runtime runtime = Runtime.instance();

            //Ajouter des propriétés à mon container
            Properties properties = new ExtendedProperties();
            ProfileImpl profileImpl = new ProfileImpl(false);
            properties.setProperty(ProfileImpl.MAIN_HOST, "localhost");
            AgentContainer agentContainer = runtime.createAgentContainer(profileImpl);
            agentContainer.start();

        } catch (ControllerException e) {
            e.printStackTrace();
        }
    }


}