package note.com.test;

import note.com.beans.factorybean.Fruit;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

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
public class FactoryBeanTest {

    /**
     * 工厂模式创建Bean示例
     * @param args
     */
    @Test
    public void createBeanByFactory(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
        Fruit fruit = (Fruit)factory.getBean("fruit");
        System.out.println(fruit);
        System.out.println(fruit.getName());

    }

    /**
     * 测试工厂单例生效
     * @param args
     */
    @Test
    public void createBeanByFactorySingleton(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
        Fruit fruit = (Fruit)factory.getBean("fruit");
        Fruit fruit2 = (Fruit)factory.getBean("fruit");
        System.out.println(fruit);
        System.out.println(fruit2);
        System.out.println(fruit.getName());

    }

}
