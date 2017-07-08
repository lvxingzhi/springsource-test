package note.com.test;

import note.com.beans.anno.BeanA;
import note.com.beans.anno.BeanB;
import note.com.beans.anno.BeanC;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
public class QuestionTest {

    /**
     * 题用例: 为什么这样写,注解中的Bean的属性没有得到注入?
     */
    @Test
    public void questionTest() {
        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
        BeanA beanA = (BeanA)factory.getBean("anno.beanA");
        BeanB beanB = (BeanB)factory.getBean("anno.beanB");
        BeanC beanC = (BeanC)factory.getBean("anno.beanC");
        System.out.println("spring load end");
    }

    /**
     * 答案
     * @param args
     */
    @Test
    public void answerTest(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        BeanA beanA = (BeanA) applicationContext.getBean("anno.beanA");
        BeanB beanB = (BeanB) applicationContext.getBean("anno.beanB");
        BeanC beanC = (BeanC) applicationContext.getBean("anno.beanC");
        System.out.println("spring load end");
    }
}
