package note.com.beans.listener;

import org.springframework.context.ApplicationEvent;

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
public class MyEvent extends ApplicationEvent {

    private String name = "";
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(String source) {
        super(source);
        this.name = source;
        System.out.println("event say: "+source);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
