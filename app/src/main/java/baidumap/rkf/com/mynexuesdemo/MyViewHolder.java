package baidumap.rkf.com.mynexuesdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rankaifeng on 2017/4/25.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView, tvSex;

    public MyViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.tv_name);
        tvSex = (TextView) itemView.findViewById(R.id.tv_sex);
    }


    public void bindViewHolder(UserModel model) {
        textView.setText(model.getName());
        tvSex.setText(model.getSex());
    }
}
