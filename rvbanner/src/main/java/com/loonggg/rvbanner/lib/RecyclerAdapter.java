package com.loonggg.rvbanner.lib;

import android.support.v7.widget.RecyclerView;

public abstract class RecyclerAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    protected int dataSize;

    public RecyclerAdapter(int dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        if (dataSize >= 1){
            onBind(holder,position % dataSize);
        }
    }

    public void onBind(VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataSize <= 1 ? dataSize : Integer.MAX_VALUE;
    }

    public int getDataSize() {
        return dataSize;
    }
}