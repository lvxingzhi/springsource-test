package note.com.test;

import note.com.beans.dependcy.EntityA;
import note.com.beans.dependcy.EntityB;
import note.com.beans.dependcy.EntityC;
import org.junit.Test;
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
 * @date 2017/6/29
 * @since 1.0
 */
public class DependcyTest {

    /**
     * 多例循环依赖示例 ×    单例 √
     */
    @Test
    public void dependcyTest1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        EntityA entityA = (EntityA)applicationContext.getBean("entityA");
        System.out.println(entityA);
    }

    /**
     * 循环引用示例 ×
     */
    @Test
    public void dependcyTest2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        EntityA entityA = (EntityA)applicationContext.getBean("entityA");
        EntityB entityB = (EntityB)applicationContext.getBean("entityB");
        EntityC entityC = (EntityC)applicationContext.getBean("entityC");
        System.out.println(entityA.getClass().toString());
        System.out.println(entityB.getClass().toString());
        System.out.println(entityC.getClass().toString());
        entityA.doSomething();
        System.out.println(entityA);
    }

    /**
     * 单例循环依赖解决办法
     */


}
