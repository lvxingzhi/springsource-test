package note.com.test;

import note.com.beans.reader.MyDefaultBeanDefinitionDocumentReader;
import note.com.beans.xml.BeanA;
import note.com.beans.xml.BeanB;
import note.com.beans.xml.BeanC;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
 * @date 2017/6/26
 * @since 1.0
 */
public class MainXmlTest {
    /**
     * 被废弃的容器使用方式
      */
    @Test
    public void oldMethod() {
        System.out.println("spring load end");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        BeanA beanA = (BeanA) xmlBeanFactory.getBean("xmlBeanA");
        BeanB beanB = (BeanB) xmlBeanFactory.getBean("xmlBeanB");
        BeanC beanC = (BeanC) xmlBeanFactory.getBean("xmlBeanC");
        System.out.println("spring load end");
    }

    /**
     * 新的的容器使用方式
     */
    @Test
    public void newMethod() {
        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
        BeanA beanA = (BeanA)factory.getBean("xmlBeanA");
        BeanB beanB = (BeanB)factory.getBean("xmlBeanB");
        BeanC beanC = (BeanC)factory.getBean("xmlBeanC");
        System.out.println("spring load end");
    }

    /**
     * 实现钩子方法
     */
    @Test
    public void hookTest() {
        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.setDocumentReaderClass(MyDefaultBeanDefinitionDocumentReader.class);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
        BeanA beanA = (BeanA)factory.getBean("xmlBeanA");
        BeanB beanB = (BeanB)factory.getBean("xmlBeanB");
        BeanC beanC = (BeanC)factory.getBean("xmlBeanC");
        System.out.println("spring load end");
    }
}
