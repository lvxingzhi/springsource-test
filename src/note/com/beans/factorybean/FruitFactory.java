package note.com.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lvxz5
 * @version 1.0
 * @date 2017/6/28
 * @since 1.0
 */
public class FruitFactory implements FactoryBean {

    /**
     * 获取对象
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        Fruit fruit = new Fruit();
        fruit.setName("apple");
        return fruit;
    }

    /**
     * 获取对象类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Fruit.class;
    }

    /**
     * 是否单例
     * @return
     */
    @Override
    public boolean isSingleton() {
//        return true;
        return false;
    }
}
