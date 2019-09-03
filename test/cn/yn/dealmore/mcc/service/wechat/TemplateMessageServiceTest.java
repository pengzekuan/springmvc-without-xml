package cn.yn.dealmore.mcc.service.wechat;

import cn.yn.dealmore.mcc.helper.DateHelper;
import cn.yn.dealmore.mcc.param.TemplateParam;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.Date;

/**
 * TemplateMessageService Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>06/04/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TemplateMessageServiceTest {

    @Autowired
    private TemplateMessageService templateMessageService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setTemplate(String openId, String templateId, String url, Map<String, String> header, Map<String, String> remark, List<Map<String, String>> keywords)
     */
    @Test
    public void testSetTemplate() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setKeywords(String... args)
     */
    @Test
    public void testSetKeywords() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: paySend(String openId, String orderNo, String amount, String basePath)
     */
    @Test
    public void testPaySend() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testSendOrderCancel() throws Exception {
        TemplateParam templateParam = templateMessageService.orderCancel("oHrMRs2Y_MhPHbW-7s8B7PsPIeYQ", "1231231231", "product1", DateHelper.format(new Date(), "yyyyMMddHHmmss"));
        String accessToken = "22_UFwR5sLhWvXd42pajmhzhrIX233bWYn1tZo3lO_yDBK1EOz68jHesfW-k3-xeUoUUgSXJ8CA8ab9ngocsL03qOtL94noyslEGx1Py6dvvItTtoYfyZJGCfOnkUWtdX4_bdBmkJ2YpVKGkJE1CZUgAEAIFA";
        JSONObject res = templateMessageService.send(accessToken, templateParam.toString());
        Assert.assertEquals(0, Integer.parseInt(res.optString("errcode")));
        Assert.assertEquals("ok", res.optString("errmsg"));
    }

    @Test
    public void testRegisterSend() throws IOException {
        TemplateParam templateParam = templateMessageService.registerSend("oVuOS59zV0KMGqqBxcogbxOlnpQo", "如寄", "哈哈哈哈", "13529066407", DateHelper.format(new Date(), DateHelper.PATTERN));
        String accessToken = "22_9MkpS9SVB-TLM2J3dnDvenUPm9WQhCvXsePei-_QyljxSEM6_4O0iNwcXdWqjWBWXt3iuD59UuRGGkaiXBiS-B0sPS8bPiCjEA_bxDtqUxQLIITRT11rJ7H1mj5nQzd1lDeMY9AS-c2r_o7bZQPgAFACTS";
        JSONObject res = templateMessageService.send(accessToken, templateParam.toString());
        Assert.assertEquals(0, Integer.parseInt(res.optString("errcode")));
        Assert.assertEquals("ok", res.optString("errmsg"));
    }

    @Test
    public void testtopupSend() throws IOException {
        TemplateParam templateParam = templateMessageService.topupSend("oVuOS59zV0KMGqqBxcogbxOlnpQo", "0.01", DateHelper.format(new Date(), DateHelper.PATTERN), "500");
        String accessToken = "23_amIN9sWjDWHen7dMhQNsYNu5RtRkzfntbnPGUPUvNEnE38nTiSEHVwND-z8t5GBNg6IU8OYL4tGsqH7Mzwf-nX2uiIvZ4rLUvYXEgy2gTr0W24YVfspquaXXK0oxkxE59msdM2zO-mtx0_dpNVLjAJAAIY";
        JSONObject res = templateMessageService.send(accessToken, templateParam.toString());
        Assert.assertEquals(0, Integer.parseInt(res.optString("errcode")));
        Assert.assertEquals("ok", res.optString("errmsg"));
    }

    /**
     * Method: orderCancel(String openId, String orderNo, String product, String payTime)
     */
    @Test
    public void testOrderCancel() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: send(String accessToken, String data)
     */
    @Test
    public void testSend() throws Exception {
//TODO: Test goes here... 
    }


} 
