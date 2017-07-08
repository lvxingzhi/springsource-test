package note.com.test;

import note.com.beans.propertyeditor.NormalBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
public class PropertyEditorTest {

    /**
     * 实现自定义属性编辑器
     * @param args
     */
    public static void main(String[] args) {
//        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
//        xmlBeanDefinitionReader.setDocumentReaderClass(MyDefaultBeanDefinitionDocumentReader.class);
//        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
//        NormalBean normalBean = (NormalBean) factory.getBean("normalBean");
//        System.out.println(normalBean);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        NormalBean normalBean = (NormalBean)ctx.getBean("normalBean");
        System.out.println(normalBean);
    }

}
