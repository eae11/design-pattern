package pattern.C6Builder.sample02;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException {
        ActorBuilder builder = (ActorBuilder) XMLUtil.getBean();
        Actor actor = new Client().create(builder);
        System.out.println(actor);
    }

    public Actor create(ActorBuilder builder) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException {
        Actor actor = null;
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        //通过钩子方法来控制产品的构建
        if (!builder.isBareheaded()) {
            builder.buildHairstyle();
        }

        actor = builder.createActor();
        return actor;
    }
}
