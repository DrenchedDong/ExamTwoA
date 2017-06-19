package dongting.bwei.com.dongting1503d20170619;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
/**
 * 作者:${董婷}
 * 日期:2017/6/19
 * 描述:导航页
 */
public class MainActivity extends Activity {

    private SharedPreferences sp;
    int num=3;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.count);

        sp = getSharedPreferences("config", MODE_PRIVATE);

        if(sp.getBoolean("first",false)==true){
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
            finish();
        }
        count();
    }

    private void count() {
        final Timer timer = new Timer();

       timer .schedule(new TimerTask() {
            @Override
            public void run() {

               runOnUiThread(new Runnable() {
                   @Override
                   public void run() {
                       tv.setText("还有"+num+"秒跳转");
                       num--;

                       if(num <=0){
                           timer.cancel();

                           sp.edit().putBoolean("first",true).commit();
                           startActivity(new Intent(MainActivity.this,SecondActivity.class));
                           finish();
                       }
                   }
               });
            }
        },0,1000);
    }
}
