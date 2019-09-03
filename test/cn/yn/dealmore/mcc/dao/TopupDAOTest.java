package cn.yn.dealmore.mcc.dao;

import cn.yn.dealmore.mcc.enums.OrderType;
import cn.yn.dealmore.mcc.enums.PayStatus;
import cn.yn.dealmore.mcc.model.Topup;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Connection;

/**
 * TopupDAO Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/21/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TopupDAOTest {

    @Autowired
    private Connection connection;

    @Autowired
    private TopupDAO topupDAO;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
        connection.close();
    }

    /**
     * Method: create(Connection connection, Topup topup)
     */
    @Test
    public void testCreate() throws Exception {
        JSONObject prePayRes = JSONObject.fromObject("{ \"appid\": \"00168054\", \"chnltrxid\": \"111949920000605422\", \"cusid\": \"552731073995AMX\", \"payinfo\":\"{\\\"appId\\\":\\\"wx841e62d0697c2a8b\\\",\\\"timeStamp\\\":\\\"1558436579\\\",\\\"nonceStr\\\":\\\"6829bdaa0b2444c983d679ee76845c51\\\",\\\"package\\\":\\\"prepay_id=wx21190259320246a08d277ba84258839558\\\",\\\"signType\\\":\\\"RSA\\\",\\\"paySign\\\":\\\"f2qE/90wfkKj/L9w/h1v0jL8bJRE18hbDfibUS/NvLZ66J2S6J2n9imrK4sBGhvIxZSEiBqa2JMIGN331PhkPbaRDLbBb36eVkSz/YncaANlC6YPp0cVB2To31VmwhI8p9WdbP61U7uv928ECvpe/ytnG5kGOmB+OernVUvA8yEyIY93ELzJLksnn5YpXycL1yqMHZU6vQCE+NhfnxPrCMlJFBJEdbFCUqinEiyJr2iO7HOYVP1BS4bZx5xg5kYqbQRwuVfU3DpkJgaOFj12AHiZ41IPtf4O0j2VUdu12TlhQcxUtCQzSc4/KA8AfifwIQXECN7IBuvB1wVAoO8hTg==\\\"}\", \"randomstr\": \"840103925914\", \"reqsn\": \"120190521134178300000386\", \"retcode\": \"SUCCESS\", \"sign\": \"E69EF663E020D6B6DF056E8A4FDF263E\", \"trxid\": \"111949920000605422\", \"trxstatus\":\"0000\" }");
        Topup topup = new Topup();
        topup.setType(OrderType.CONSUME.getKey());
        topup.setUserId(1);
        topup.setMchId(prePayRes.optString("cusid") + "|" + prePayRes.optString("appid"));
        topup.setTransNo(prePayRes.optString("trxid"));
        topup.setAmount(100);
        topup.setPayStatus(PayStatus.NOT_PAY.getKey());
        topup = topupDAO.create(connection, topup);
        System.out.println(topup);
    }

    /**
     * Method: paid(Connection connection, String transNo, String outTransNo, String payTime, long fee)
     */
    @Test
    public void testPaid() throws Exception {
//TODO: Test goes here... 
    }


} 
