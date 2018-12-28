package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    public MyAdapter(Context context){
        mContext = context;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if(convertView == null){
            convertView = new LinearLayout(mContext);
            viewHolder.textView = new TextView(mContext);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT , ViewGroup.LayoutParams.WRAP_CONTENT);
            ((LinearLayout) convertView).addView(viewHolder.textView , params);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        bindData(position , viewHolder);
        return convertView;
    }


    public void bindData(int pos , ViewHolder viewHolder){
        viewHolder.textView.setTextColor(Color.RED);
        viewHolder.textView.setTextSize(20);
        viewHolder.textView.setText((String) getItem(pos));
        viewHolder.textView.setGravity(Gravity.CENTER);
    }

    class ViewHolder{
        TextView textView;
    }

}
