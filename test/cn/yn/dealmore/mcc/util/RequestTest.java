package cn.yn.dealmore.mcc.util;

import cn.yn.dealmore.mcc.config.Merchant;
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
 * Request Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 18, 2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class RequestTest {

	@Autowired
	private Merchant merchant;

	@Before
	public void before() throws Exception {
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: post(String url, UrlEncodedFormEntity urlEncodedFormEntity)
	 */
	@Test
	public void testPost() throws Exception {
		JSONObject entity = Request.post(merchant.getApiPayment(), null);
		System.out.println(entity);
	}


} 
