package cn.yn.dealmore.mcc.config;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * PropertyLoader Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/17/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class PropertyLoaderTest {

    @Value("${debug}")
    private boolean debug;

    @Value("${env}")
    private String env;

    @Value("${druid.password}")
    private Object dbconfig;


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLoad() {
        System.out.println(debug);
        System.out.println(env);
        System.out.println(dbconfig);
    }

} 
