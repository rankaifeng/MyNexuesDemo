package baidumap.rkf.com.mynexuesdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rankaifeng on 2017/4/25.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    LayoutInflater inflater;
    List<UserModel> mUserModels = new ArrayList<>();

    public MyAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        UserModel userModel = mUserModels.get(position);
        if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).bindViewHolder(userModel);
        }
    }

    public void addUsersList(List<UserModel> list) {
        mUserModels.addAll(list);
    }


    @Override
    public int getItemCount() {
        return mUserModels == null ? 0 : mUserModels.size();
    }
}
