package note.com.beans.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
@Component("anno.beanC")
public class BeanC {

    private String name = "";

    @Autowired
    @Qualifier("anno.beanB")
    private BeanB beanB;

    @Resource(name = "anno.beanA")
    private BeanA beanA;

    public BeanC() {
        this.name =  "bean name: C";
        System.out.println("load C");
    }
}
