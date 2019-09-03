package cn.yn.dealmore.mcc.config;

import cn.yn.dealmore.mcc.util.enums.Enviroment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Global Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/17/2019</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class GlobalTest {

    @Autowired
    private Global global;

    /**
     * Method: isDebug()
     */
    @Test
    public void testIsDebug() {
        Assert.assertFalse(global.isDebug());
    }

    /**
     * Method: getEnv()
     */
    @Test
    public void testGetEnv() {
        Assert.assertEquals(Enviroment.DEVELOP.getName(), global.getEnv());
    }

    /**
     * Method: getDomain()
     */
    @Test
    public void testGetDomain() {
        Assert.assertEquals("https://pzk.dm.ynhongjia.cn/", global.getDomain());
    }

    /**
     * Method: getOrderRange()
     */
    @Test
    public void testGetOrderRange() {
        Assert.assertEquals(10, global.getOrderRange());
    }

    /**
     * Method: getReceiveTime()
     */
    @Test
    public void testGetReceiveTime() {
        Assert.assertEquals(35, global.getReceiveTime());
    }

    /**
     * Method: getContact()
     */
    @Test
    public void testGetContact() {
        Assert.assertEquals("0871-63373355", global.getContact());
    }


} 
