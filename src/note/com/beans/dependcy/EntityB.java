package note.com.beans.dependcy;

import org.springframework.context.annotation.Scope;
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
 * @date 2017/6/29
 * @since 1.0
 */
@Component("entityB")
@Scope("prototype")
//@Scope("singleton")
public class EntityB{

    @Resource(name = "entityC")
    private EntityC entityC;

    public EntityC getEntityC() {
        return entityC;
    }

    public void setEntityC(EntityC entityC) {
        this.entityC = entityC;
    }

    public void doSomething(){
        entityC.doSomething();
    }
}
