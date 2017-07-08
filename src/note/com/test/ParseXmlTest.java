package note.com.test;

import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
public class ParseXmlTest {
    /**
     * DOM解析XML
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Class.forName(DocumentBuilderFactory.class.getName());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        ClassPathResource classPathResource = new ClassPathResource("spring-config.xml");
        Document document = documentBuilder.parse(classPathResource.getInputStream());
        Element element = document.getDocumentElement();
        NodeList nl = element.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);
            if (node instanceof Element) {
                Element ele = (Element) node;
                System.out.println(ele.getNodeName());
            }
        }
    }

}
