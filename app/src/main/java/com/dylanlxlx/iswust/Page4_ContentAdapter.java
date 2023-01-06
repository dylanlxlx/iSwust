package com.dylanlxlx.iswust;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Page4_ContentAdapter extends ArrayAdapter {

    private final int resourceId;

    public Page4_ContentAdapter(@NonNull Context context, int resource, List<Page4_ItemContent> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Page4_ItemContent content = (Page4_ItemContent) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView itemImg = view.findViewById(R.id.page4ItemImg);
        TextView itemName = view.findViewById(R.id.page4ItemName);
        itemImg.setImageResource(content.getImgId());
        itemName.setText(content.getItemName());
        return view;
    }
}
