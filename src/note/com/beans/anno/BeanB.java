package note.com.beans.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
@Component("anno.beanB")
public class BeanB {

    private String name = "";

    @Autowired
    @Qualifier("anno.beanA")
    private BeanA beanA;

    public BeanB() {
        this.name =  "bean name: B";
        System.out.println("load B");
    }

}
