package note.com.test;

import note.com.beans.listener.MyLogic;
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
 * @date 2017/6/27
 * @since 1.0
 */
public class ListenerTest {

    /**
     * Spring 监听事件(观察者模式) ApplicationEventMulticaster管理listener
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        MyLogic myLogic = (MyLogic) applicationContext.getBean("myLogic");
        myLogic.doSomething();
    }

}
