package cn.yn.dealmore.mcc.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Wechat Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/17/2019</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class WechatTest {

    @Autowired
    private Wechat wechat;

    /**
     * Method: getAppId()
     */
    @Test
    public void testGetAppId() {
        Assert.assertEquals("wxc33f9df70511d21d", wechat.getAppId());
    }

    /**
     * Method: getAppSecret()
     */
    @Test
    public void testGetAppSecret() {
        Assert.assertEquals("a43169c75de668098e1d6a251cc6c06d", wechat.getAppSecret());
    }
} 
