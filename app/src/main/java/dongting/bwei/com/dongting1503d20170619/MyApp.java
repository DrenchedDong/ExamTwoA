package dongting.bwei.com.dongting1503d20170619;

import android.app.Application;

import org.xutils.x;

/**
 * 作者:${董婷}
 * 日期:2017/6/19
 * 描述:定义application
 */

public class MyApp  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        x.isDebug();
    }
}