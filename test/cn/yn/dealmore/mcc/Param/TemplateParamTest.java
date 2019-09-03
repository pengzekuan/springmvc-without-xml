package cn.yn.dealmore.mcc.param;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TemplateParam Tester.
 *
 * @author <peter>
 * @version 1.0
 * @since <pre>05/31/2019</pre>
 */
public class TemplateParamTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
        TemplateParam param = new TemplateParam("张三", "template_id_1");
        Map<String, String> header = new HashMap<>();
        header.put("value", "欢迎光临！");
        param.setHeader(header);
        Map<String, String> remark = new HashMap<>();
        remark.put("value", "欢迎再来！");
        remark.put("color", "#FF0000");
        param.setRemark(remark);

        List<Map<String, String>> keywords = new ArrayList<>();
        Map<String, String> keyword = new HashMap<>();
        keyword.put("value", "keyword1");
        keywords.add(keyword);
        keyword.clear();
        keyword.put("value", "keyword2");
        keyword.put("color", "#00FF00");
        keywords.add(keyword);
        param.setKeywords(keywords);
        System.out.println(param.toString());
    }


} 
