package com.loonggg.rvbanner;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.loonggg.rvbanner.lib.RecyclerAdapter;

import java.util.List;

/**
 * @author lihongwan
 * @created 2018/9/30
 * @describe
 **/
public class MyAdapter extends RecyclerAdapter<MyAdapter.ViewHolder> {

    private Context mContext;
    private List<String> imgList;

    public MyAdapter(Context mContext, List<String> imgList) {
        super(imgList.size());
        this.mContext = mContext;
        this.imgList = imgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AppCompatImageView img = new AppCompatImageView(parent.getContext());
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        img.setLayoutParams(params);
        img.setScaleType(AppCompatImageView.ScaleType.CENTER_CROP);
        return new ViewHolder(img);
    }

    @Override
    public void onBind(ViewHolder holder, int position) {
        Glide.with(mContext)
                .load(imgList.get(position))
                .placeholder(R.mipmap.ic_launcher)
                .into((ImageView) holder.itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG","123");
            }
        });
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
