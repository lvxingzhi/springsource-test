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
@Component("entityC")
@Scope("prototype")
//@Scope("singleton")
public class EntityC{

    @Resource(name = "entityA")
    private EntityA entityA;

    public EntityA getEntityA() {
        return entityA;
    }

    public void setEntityA(EntityA entityA) {
        this.entityA = entityA;
    }

    public void doSomething(){
      entityA.doSomething();
    }
}
