package dongting.bwei.com.dongting1503d20170619.bean;

/**
 * 作者:${董婷}
 * 日期:2017/6/19
 * 描述:
 */

public class Bean1 {
    private String content;
    private String date;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bean1(String content, String date) {
        this.content = content;
        this.date = date;
    }
}
