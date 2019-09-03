package cn.yn.dealmore.mcc.service.wap; 

import cn.yn.dealmore.mcc.db.IDruidDataSource;
import cn.yn.dealmore.mcc.util.IConstant;
import cn.yn.dealmore.mcc.util.PropertyLoader;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/** 
* WapOrderService Tester. 
* 
* @author <Authors name> 
* @since <pre>Apr 30, 2019</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class WapOrderServiceTest {

@Before
public void before() throws Exception {
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: saveWashingPic(long uid, IOperationRole role, long tar, int type, String src, String IP) 
* 
*/ 
@Test
public void testSaveWashingPic() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: orders(long uid, String target, String status, String dateStr) 
* 
*/ 
@Test
public void testOrders() throws Exception {
	List<Map<String, Object>> result = WapOrderService.orders(45, IConstant.TAG_SESSION_AGENT, "1", "2019-04-28");
	System.out.println(result);
} 

/** 
* 
* Method: initOrderInfo(long uid, long tar) 
* 
*/ 
@Test
public void testInitOrderInfo() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: requisitionOrder(long uid, IOperationRole role, long tar, String IP) 
* 
*/ 
@Test
public void testRequisitionOrder() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: serviceOrders(long uid, String scale, int curr) 
* 
*/ 
@Test
public void testServiceOrders() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: cancelOrder(long uid, IOperationRole operationRole, long tar) 
* 
*/ 
@Test
public void testCancelOrder() throws Exception { 
//TODO: Test goes here... 
} 


} 
