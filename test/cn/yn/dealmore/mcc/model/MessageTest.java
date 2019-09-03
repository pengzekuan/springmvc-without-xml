package cn.yn.dealmore.mcc.model;

import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Message Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/31/2019</pre>
 */
public class MessageTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSend() throws IOException, ClassNotFoundException {
        // 序列化
        Message message = new Message();
        message.setId(1);
        message.setSender("sender");
        message.setReceiver("fafjaofjaof");
        System.out.println("对象:" + JSONObject.fromObject(message));

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(message);

        String outStr = out.toString("ISO-8859-1");

        System.out.println("序列化：" + outStr);

        byte[] bytes = out.toByteArray();

        InputStream in = new ByteArrayInputStream(outStr.getBytes(StandardCharsets.ISO_8859_1));

        ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(in));

        Object object = objectInputStream.readObject();


        System.out.println("反序列化对象：" + JSONObject.fromObject(object));

    }

} 
