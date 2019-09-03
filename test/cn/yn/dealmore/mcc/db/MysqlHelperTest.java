package cn.yn.dealmore.mcc.db;

import cn.yn.dealmore.mcc.model.Combo;
import cn.yn.dealmore.mcc.model.OperationLog;
import cn.yn.dealmore.mcc.param.JDBCFilter;
import cn.yn.dealmore.mcc.vo.Pagination;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MysqlHelper Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 18, 2019</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class MysqlHelperTest {

    @Autowired
    private Connection connection;

    private List<JDBCFilter> where;

    private List<Map<String, String>> order;

    private Map<String, Integer> paginator;

    @Before
    public void before() throws Exception {
        System.out.println("mysql connection start...");

        where = new ArrayList<>();
        where.add(new JDBCFilter("id", 5000, "="));

        order = new ArrayList<>();
        Map<String, String> by = new HashMap<>();
        by.put("name", "id");
        by.put("seq", "desc");
        order.add(by);

        paginator = new HashMap<>();
    }

    @After
    public void after() throws Exception {
        System.out.println("mysql connection close...");
        connection.close();
    }

    /**
     * Method: create(Connection connection, Object object)
     */
    @Test
    public void testCreate() throws Exception {
        OperationLog operationLog = new OperationLog(111, 3, 1000, "test", "127.0.0.1");
        operationLog = MysqlHelper.create(this.connection, operationLog);
        this.connection.commit();
        print(operationLog);
    }

    /**
     * Method: update(Connection connection, String table, Object where, Object object)
     */
    @Test
    public void testUpdate() throws Exception {
        OperationLog operationLog = new OperationLog();
        Map<String, Object> modifier = new HashMap<>();
        modifier.put("remarks", "gefaw");
        long id = MysqlHelper.update(connection, OperationLog.class, modifier, where);
        connection.commit();
        print(id);
    }

    /**
     * Method: get(Connection connection, String table, Object where)
     */
    @Test
    public void testGet() throws Exception {
        OperationLog operationLog = MysqlHelper.get(this.connection, OperationLog.class, null);
        Assert.assertNotNull(operationLog);
        print(operationLog);

        List<JDBCFilter> list = new ArrayList<>();
        list.add(new JDBCFilter("id", 6633, "="));
        OperationLog operationLog1 = MysqlHelper.get(this.connection, OperationLog.class, list);
        Assert.assertNotNull(operationLog1);
        print(operationLog1);
    }

    @Test
    public void testGetById() throws Exception {
        List<JDBCFilter> where = new ArrayList<>();
        where.add(new JDBCFilter("id", 17, "="));
        Combo combo = MysqlHelper.get(connection, Combo.class, where);
        Assert.assertNotNull(combo);
        print(combo);
    }

    /**
     * Method: count(Connection connection, Class<T> clz, List<Map<String, Object>> where)
     *
     * @throws Exception
     */
    @Test
    public void testCount() throws Exception {
        int count = MysqlHelper.count(this.connection, OperationLog.class, null);
        Assert.assertTrue(count >= 0);

        int countWithFilter = MysqlHelper.count(this.connection, OperationLog.class, this.where);
        Assert.assertTrue(countWithFilter >= 0);
        print(countWithFilter);
    }


    /**
     * Method: getAll(Connection connection, String table, Object where, Object order)
     */
    @Test
    public void testGetAll() throws Exception {
        List<OperationLog> operationLogs = MysqlHelper.getAll(this.connection, OperationLog.class, where, order);
        Assert.assertNotNull(operationLogs);
        print(operationLogs);
    }

    @Test
    public void testGetAllWithCount() throws Exception {
        Pagination<OperationLog> pagination = MysqlHelper.getAllWithCount(connection, OperationLog.class, where, order, paginator);
        print(pagination);
        Assert.assertNotNull(pagination);

        paginator.put("page", 2);
        Pagination<OperationLog> pagination1 = MysqlHelper.getAllWithCount(connection, OperationLog.class, where, order, paginator);
        print(pagination1);
        Assert.assertNotNull(pagination1);
    }

    private void print(Object object) {
        if (object instanceof Number) {
            System.out.println(object);
        }
        if (object instanceof List) {
            System.out.println(JSONArray.fromObject(object).toString());
            return;
        }
        System.out.println(JSONObject.fromObject(object));
    }

} 
