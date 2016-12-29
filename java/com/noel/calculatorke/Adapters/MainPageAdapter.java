package com.noel.calculatorke.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.noel.calculatorke.MenuItem;
import com.noel.calculatorke.R;

/**
 * Created by Noel on 12/28/2016.
 */
public class MainPageAdapter extends BaseAdapter {

    private final Context mContext;
    private final MenuItem[] mItems;

    public MainPageAdapter(Context context, MenuItem[] items) {
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public int getCount() {
        return mItems.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final MenuItem item = mItems[i];

        if(view == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(R.layout.grid_menu_item, null);
        }
        final ImageView imgView = (ImageView) view.findViewById(R.id.menu_grid_item_image);
        final TextView textView = (TextView) view.findViewById(R.id.menu_grid_item_title);
        textView.setText(mContext.getString(item.getName()));
        imgView.setImageDrawable(ContextCompat.getDrawable(mContext, item.getImageResource()));

        return view;
    }
}
