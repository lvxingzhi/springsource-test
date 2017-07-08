package note.com.beans.anno;

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
@Component("anno.beanA")
public class BeanA {

    private String name = "";

    public BeanA(){
        this.name = "bean name: A";
        System.out.println("load A");
    }

}
