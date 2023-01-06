package com.dylanlxlx.iswust;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Page1_RV_Adapter extends RecyclerView.Adapter<Page1_RV_Adapter.ViewHolder> {
    private final List<Page1_Item> mItemList;

    public Page1_RV_Adapter(List<Page1_Item> mItemList) {
        this.mItemList = mItemList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        View iView;
        ImageView itemImg;
        TextView itemText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iView = itemView;
            itemImg = itemView.findViewById(R.id.item_img);
            itemText = itemView.findViewById(R.id.item_text);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page1_recyclerview_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        holder.iView.setOnClickListener(v -> {
            int position = holder.getAdapterPosition();
            Page1_Item item = mItemList.get(position);
            Toast.makeText(v.getContext(), item.getItemText(), Toast.LENGTH_SHORT).show();
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Page1_Item item = mItemList.get(position);
        holder.itemText.setText(item.getItemText());
        holder.itemImg.setImageResource(item.getItemImgId());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
