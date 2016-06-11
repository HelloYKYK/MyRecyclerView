package com.toy.iwillgotothatcompany;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by TOY on 2016/6/11.
 *
 */
public class MyAdapter extends BaseQuickAdapter<String> {

    private final int[] images;

    public MyAdapter(Context context) {
        super(context,R.layout.item_recyclerview,DataServer.getData());
        images = new int[]{R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m5, R.drawable.m6, R.drawable.m7, R.drawable.m8, R.drawable.m9, R.drawable.m10};

    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, String s) {
        baseViewHolder.getView(R.id.iv_head);
        baseViewHolder.setText(R.id.tv_title,s);
        Glide.with(mContext).load(R.drawable.m6).into((ImageView) baseViewHolder.getView(R.id.iv_head));
    }

}
