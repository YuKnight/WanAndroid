package com.hzy.wanandroid.adapter;

import android.content.Context;

import com.hzy.wanandroid.R;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by hzy on 2019/1/24
 *
 * @author Administrator
 */
public class PubAdapter extends CommonAdapter<String> {

    public PubAdapter(Context context, List<String> datas) {
        super(context, R.layout.item_pub, datas);
    }

    @Override
    protected void convert(ViewHolder holder, String title, int position) {
        holder.setText(R.id.tv_project, title.replace("&amp;", "&"));
    }
}
