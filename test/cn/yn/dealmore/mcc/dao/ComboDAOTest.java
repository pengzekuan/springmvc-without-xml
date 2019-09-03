package cn.yn.dealmore.mcc.dao;

import net.sf.json.JSONArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * ComboDAO Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/29/2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class ComboDAOTest {

    @Autowired
    private ComboDAO comboDAO;

    @Autowired
    private Connection connection;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
        connection.close();
    }

    /**
     * Method: addCombo(Connection connection, String title, Double price, String summary, String icon, String iconSelcted, String details)
     */
    @Test
    public void testAddCombo() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateCombo(Connection connection, long id, String title, Double price, String summary, String icon, String iconSelcted, String details)
     */
    @Test
    public void testUpdateCombo() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryInfo(Connection connection, long id)
     */
    @Test
    public void testQueryInfo() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryComboForIndex(Connection connection)
     */
    @Test
    public void testQueryComboForIndex() throws Exception {
        List<Map<String, Object>> list = comboDAO.queryComboForIndex(connection);
        System.out.println(JSONArray.fromObject(list));
    }

    /**
     * Method: queryComboList(Connection connection, int index, int counts)
     */
    @Test
    public void testQueryComboList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryComboCounts(Connection connection)
     */
    @Test
    public void testQueryComboCounts() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateFlagById(Connection connection, long id, int flag)
     */
    @Test
    public void testUpdateFlagById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryATPriceList(Connection connection, long cid)
     */
    @Test
    public void testQueryATPriceList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addComboPrice(Connection connection, long cid, List<Map<String, Object>> list)
     */
    @Test
    public void testAddComboPrice() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateComboPrice(Connection connection, long cid, long atid, double price)
     */
    @Test
    public void testUpdateComboPrice() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: queryIndexdetails(Connection connection, long comId)
     */
    @Test
    public void testQueryIndexdetails() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: get(Connection connection, long id)
     */
    @Test
    public void testGet() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAmount(Connection connection, long uid, long cid, long aid)
     */
    @Test
    public void testGetAmount() throws Exception {
//TODO: Test goes here... 
    }


} 
