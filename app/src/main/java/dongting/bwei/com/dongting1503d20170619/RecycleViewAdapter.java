package dongting.bwei.com.dongting1503d20170619;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import dongting.bwei.com.dongting1503d20170619.bean.Bean;

/**
 * 作者:${董婷}
 * 日期:2017/6/19
 * 描述:适配器
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

   List<Bean.ResultBean.DataBean> list;
    //List<Bean1> list;
    SecondActivity context;
    LayoutInflater inflater;

    public RecycleViewAdapter(SecondActivity context, List<Bean.ResultBean.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);

        OneViewHolder hViewHolder = new OneViewHolder(view);

        return hViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        OneViewHolder oneViewHolder = (OneViewHolder) holder;
        oneViewHolder.content.setText(list.get(position).getContent());
        oneViewHolder.date.setText(list.get(position).getUpdatetime());

            oneViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                listener.onItemClickListener(position,v);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    class OneViewHolder extends RecyclerView.ViewHolder {

        TextView content;
        TextView date;

        public OneViewHolder(View itemView) {
            super(itemView);

            content = (TextView) itemView.findViewById(R.id.content);
            date = (TextView) itemView.findViewById(R.id.date);
        }
    }

     interface OnItemClickListener {

            void onItemClickListener(int position,View view);
        }

        OnItemClickListener listener ;

        public void setOnItemClickListener(OnItemClickListener listener){
            this.listener = listener;
        }
}
