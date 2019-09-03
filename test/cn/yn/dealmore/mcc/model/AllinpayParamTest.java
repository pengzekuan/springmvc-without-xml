package cn.yn.dealmore.mcc.model;

import cn.yn.dealmore.mcc.config.Merchant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * AllinpayParam Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>06/04/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class AllinpayParamTest {

    @Autowired
    private Merchant merchant;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetPaymentParams() {
        AllinpayParam allinpayParam = new AllinpayParam(
                "552731073995AMX", "00168054", merchant.getAppKey(), 200, "1190604000001ad631" + "1", "111949920000623881");
        System.out.println(allinpayParam.getPaymentParams(false));

        int c = 0;
    }

    /**
     * Method: getSign()
     */
    @Test
    public void testGetSign() throws Exception {
        AllinpayParam allinpayParam = new AllinpayParam(
                "552731073995AMX", "00168054", merchant.getAppKey(), 200, "1190604000001ad631" + "1", "111949920000623881");
        System.out.println(allinpayParam.getUrlEncodedFormEntity(merchant.getAppKey()));
    }

    /**
     * Method: getRandomStr()
     */
    @Test
    public void testGetRandomStr() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = AllinpayParam.getClass().getMethod("getRandomStr"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: getMd5Sign(String key)
     */
    @Test
    public void testGetMd5Sign() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = AllinpayParam.getClass().getMethod("getMd5Sign", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: getSignByType(SignType signType, String key)
     */
    @Test
    public void testGetSignByType() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = AllinpayParam.getClass().getMethod("getSignByType", SignType.class, String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: map2Str(Map<String, String> map)
     */
    @Test
    public void testMap2Str() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = AllinpayParam.getClass().getMethod("map2Str", Map<String,.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: md5(StringBuffer stringBuffer)
     */
    @Test
    public void testMd5() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = AllinpayParam.getClass().getMethod("md5", StringBuffer.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
