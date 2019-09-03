package cn.yn.dealmore.mcc.service.payment;

import java.util.UUID;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * AllinpayService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 18, 2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class AllinpayServiceTest {

	@Autowired
	private AllinpayService allinpayService;

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: pay(String openId, String ono, int amount, String body, String remoteAddr, String clientIp)
	 */
	@Test
	public void testPay() throws Exception {
		String openId = "o49cx0VPfRaL-zh0fiwe4Hxxy_UU";
		String ono = UUID.randomUUID().toString();
		long amount = 1L;
		String body = "测试";
		String remoteAddr = "https://pzk.dm.ynhongjia.cn/";
		String clientIp = "127.0.0.1";
		JSONObject result = allinpayService.pay(openId, ono, amount, body, remoteAddr, clientIp);
		System.out.println(result);
	}

	/**
	 * Method: refund()
	 */
	@Test
	public void testRefund() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: query()
	 */
	@Test
	public void testQuery() throws Exception {
//TODO: Test goes here... 
	}


} 
