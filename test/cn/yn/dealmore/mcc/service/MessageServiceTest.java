package cn.yn.dealmore.mcc.service;

import cn.yn.dealmore.mcc.dao.OrderDAO;
import cn.yn.dealmore.mcc.dao.TopupDAO;
import cn.yn.dealmore.mcc.model.Message;
import cn.yn.dealmore.mcc.model.Order;
import cn.yn.dealmore.mcc.model.Topup;
import cn.yn.dealmore.mcc.util.IServletUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * MessageService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/16/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class MessageServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private Connection connection;

    private MockHttpServletRequest request;

    private MockHttpServletResponse response;

    @Autowired
    private MessageService messageService;

    @Autowired
    private OrderDAO orderDAO;
    @Autowired
    private TopupDAO topupDAO;

    @Before
    public void before() throws Exception {
        request = new MockHttpServletRequest();
    }

    @After
    public void after() throws Exception {
        connection.close();
    }

    /**
     * Method: create(Message message)
     */
    @Test
    public void testCreate() throws Exception {
        Message message = new Message();
        messageService.create(message);
    }

    @Test
    public void testBatchSendToWasher() throws Exception {
        Order order = orderDAO.findById(connection, 418);
        messageService.batchSendToWasher(connection, order, IServletUtil.getRequestBasePath(request));
    }

    @Test
    public void testSendToConsumer() throws SQLException {
        Topup topup = topupDAO.findById(connection, 76);
        messageService.sendToConsumer(connection, topup);
    }
} 
