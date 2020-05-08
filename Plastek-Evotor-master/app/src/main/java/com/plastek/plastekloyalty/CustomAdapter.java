package com.plastek.plastekloyalty;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<CustomEditObject> {
    private Context mContext;
    private List<CustomEditObject> mItems;
    private ListViewHolder holder;

    CustomAdapter(Context context, int resourceId, List<CustomEditObject> objects){
        super(context, resourceId, objects);
        this.mItems = objects;
        this.mContext = context;
    }

    private class ListViewHolder{
        TextView name, price, qty;
        Button btnRemove;
    }
}
