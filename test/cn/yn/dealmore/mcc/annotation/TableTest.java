package cn.yn.dealmore.mcc.annotation;

import cn.yn.dealmore.mcc.enums.OrderType;
import cn.yn.dealmore.mcc.model.Topup;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @package cn.yn.dealmore.mcc.annotation
 * @project wash-car-system
 * @user pengzekuan
 * @time 2019-05-18
 */
public class TableTest {

    @Test
    public void tableTest() {
        Topup topup = new Topup();
        topup.setType(OrderType.CONSUME.getKey());
        Class<?> clazz = topup.getClass();
//		clazz.isAnnotationPresent((Class<? extends Annotation>) clazz);
//		System.out.println(clazz.isAnnotationPresent((Class<? extends Annotation>) clazz));

        try {
            boolean isTable = clazz.isAnnotationPresent(Table.class);
            if (isTable) {
                String table = clazz.getAnnotation(Table.class).value();
                System.out.println("表：" + table);
                Field[] fields = clazz.getDeclaredFields();
                List<String> list = new ArrayList<>();
                for (Field field : fields) {
                    field.setAccessible(true);
                    list.add(field.getName());
                    if (field.isAnnotationPresent(Column.class)) {
                        Column column = field.getAnnotation(Column.class);
                        if (column.primary()) {
                            continue;
                        }
                        String columnValue = column.value();
                        System.out.println("字段：" + columnValue);
                        System.out.println("字段：" + columnValue + "=" + field.get(topup));
                    }
                }
                System.out.println(StringUtils.join(list.toArray(), ","));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
