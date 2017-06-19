package dongting.bwei.com.dongting1503d20170619;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnLoadMoreListener;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.google.gson.Gson;
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import dongting.bwei.com.dongting1503d20170619.bean.Bean;
import dongting.bwei.com.dongting1503d20170619.bean.Bean1;
import dongting.bwei.com.dongting1503d20170619.footer.LoadMoreFooterView;

import static org.xutils.x.http;

/**
 * 作者:${董婷}
 * 日期:2017/6/19
 * 描述:跳转界面
 */

public class SecondActivity extends Activity {
    Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    refresh=false;
                    initData();
                    recyclerView.setRefreshing(false);

                    break;
                case 2:
                    refresh=false;
                    initData();

                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.GONE);

                    break;
            }
        }
    } ;
    private LoadMoreFooterView loadMoreFooterView;
    private IRecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
   List<Bean.ResultBean.DataBean> list=new ArrayList<>();

   // List<Bean1> list=new ArrayList<>();

    boolean refresh=true;
    private RecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        recyclerView = (IRecyclerView) findViewById(R.id.recycleview_id);
        loadMoreFooterView = (LoadMoreFooterView)recyclerView.getLoadMoreFooterView();

        initData();

        //设置布局管理器
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //上拉加载更多
        recyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.LOADING);
                handler.sendEmptyMessageDelayed(2,2000);

            }
        });

//下拉刷新
        recyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {

                recyclerView.setRefreshing(true);
                list.clear();

                handler.sendEmptyMessageDelayed(1,2000);

            }
        });

        recyclerView.addItemDecoration(
                new HorizontalDividerItemDecoration.Builder(this)
                        .color(Color.RED)
//                        .sizeResId(R.dimen.divider)
//                        .marginResId(R.dimen.leftmargin, R.dimen.rightmargin)
                        .build());

    }

    private void alert(final int position) {

        // 创建构建器
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 设置参数
        builder.setTitle("确定要删除吗")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {// 积极

                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which) {

                        list.remove(position);
                        adapter.notifyDataSetChanged();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {// 消极

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {

            }
        });
        builder.create().show();
    }

    private void goAdapter(boolean refresh) {
        if(refresh==true){
            adapter = new RecycleViewAdapter(this,list);
            recyclerView.setIAdapter(adapter);

            adapter.setOnItemClickListener(new RecycleViewAdapter.OnItemClickListener() {
                @Override
                public void onItemClickListener(int position, View view) {
                    alert(position);
                }
            });

        }else{
            adapter.notifyDataSetChanged();
        }
    }

    private void initData() {
        //http://japi.juhe.cn/joke/content/list.from?key=94fbc7ec2262160140d71e1418322f34%20&page=1&pagesize=10&sort=asc&time=1418745237
        String url=
                "http://result.eolinker.com/64ieQM526f2fada4fd6cbaab4b3b59a6088fd5c8f96bbcd?uri=www.eolinker.com/api/demo";
        RequestParams requestParams=new RequestParams(url);
        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                Bean bean = gson.fromJson(result, Bean.class);
                List<Bean.ResultBean.DataBean> data = bean.getResult().getData();
                list.addAll(data);
                Log.e("--",result);
                goAdapter(refresh);
            }
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                System.out.println("fail = " + ex);
            }

            @Override
            public void onCancelled(CancelledException cex) {
            }

            @Override
            public void onFinished() {

            }
        });

      /*  for(int i=0;i<50;i++){
            list.add(new Bean1("内容"+i,"更新时间"+i));
        }

        goAdapter(refresh);*/
    }
}