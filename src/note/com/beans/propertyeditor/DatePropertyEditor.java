package note.com.beans.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * @date 2017/6/28
 * @since 1.0
 */
public class DatePropertyEditor extends PropertyEditorSupport{

    /**
     * 日期表达式
     */
    private static String PATTERN = "yyyy-MM-dd";

    @Override
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        SimpleDateFormat sf = new SimpleDateFormat(PATTERN);
        try {
            Date time = sf.parse(text);
            setValue(time);// 设置值
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getAsText() {
        Date value = (Date) getValue();
        return "";
    }

}
