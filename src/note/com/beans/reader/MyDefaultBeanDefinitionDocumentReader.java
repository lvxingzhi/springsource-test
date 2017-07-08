package note.com.beans.reader;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

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
 * @date 2017/6/27
 * @since 1.0
 */
public class MyDefaultBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader{

    // 前置
    protected void preProcessXml(Element root) {
        System.out.println("前置钩子方法实现");
    }

    // 后置
    protected void postProcessXml(Element root) {
        System.out.println("后置钩子方法实现");
    }

}
