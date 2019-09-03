package cn.yn.dealmore.mcc.service.consumer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * ConsumerOrderService Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/30/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class ConsumerOrderServiceTest {

    @Autowired
    private ConsumerOrderService consumerOrderService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: orderStatusChecker(long uid, long oid, String ono)
     */
    @Test
    public void testOrderStatusChecker() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: ordersdetails(long oid)
     */
    @Test
    public void testOrdersdetails() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: orders(long uid, int curr, int type)
     */
    @Test
    public void testOrders() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: paymentWithFund(long uid, long oid, String ono, String IP)
     */
    @Test
    public void testPaymentWithFund() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: cancel()
     */
    @Test
    public void testCancel() throws Exception {
        consumerOrderService.cancel();
    }

    /**
     * Method: init(OrderParam param)
     */
    @Test
    public void testInit() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: payment(long id)
     */
    @Test
    public void testPayment() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: rating(long uid, long oid, int starRating, String review, String IP)
     */
    @Test
    public void testRating() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: refund(long uid, long oid, String IP)
     */
    @Test
    public void testRefund() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: orderDetail(long uid, long oid, long wid)
     */
    @Test
    public void testOrderDetail() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: orderDetailing(long oid, long wid)
     */
    @Test
    public void testOrderDetailing() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: paymentWithTLApply(long uid, long oid, String ono, long bid, String IP)
     */
    @Test
    public void testPaymentWithTLApply() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: initCheckoutInfo(long uid, long combo, long auto)
     */
    @Test
    public void testInitCheckoutInfo() throws Exception {
//TODO: Test goes here... 
    }


} 
