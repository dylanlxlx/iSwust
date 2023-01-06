package com.dylanlxlx.iswust;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Page4_My extends Fragment {

    private final List<Page4_ItemContent> itemContents = new ArrayList<>();
    private final String[] itemNames = {"我的绑定", "安全中心", "关于我们", "意见反馈", "退出登录"};
    private final int[] itemImgId = {R.drawable.binding, R.drawable.security, R.drawable.about_us, R.drawable.feedback, R.drawable.exit};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_page4_my, container, false);
        initContents();
        ListView listView = v.findViewById(R.id.myPageList);
        Page4_ContentAdapter adapter = new Page4_ContentAdapter(requireActivity(), R.layout.page4_list_item, itemContents);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
//            Page4_ItemContent contents = itemContents.get(position);
        });
        return v;
    }

    private void initContents() {
        Page4_ItemContent[] contents = new Page4_ItemContent[5];
        contents[0] = new Page4_ItemContent(itemImgId[0], itemNames[0]);
        itemContents.add(contents[0]);
        contents[1] = new Page4_ItemContent(itemImgId[1], itemNames[1]);
        itemContents.add(contents[1]);
        contents[2] = new Page4_ItemContent(itemImgId[2], itemNames[2]);
        itemContents.add(contents[2]);
        contents[3] = new Page4_ItemContent(itemImgId[3], itemNames[3]);
        itemContents.add(contents[3]);
        contents[4] = new Page4_ItemContent(itemImgId[4], itemNames[4]);
        itemContents.add(contents[4]);
    }
}