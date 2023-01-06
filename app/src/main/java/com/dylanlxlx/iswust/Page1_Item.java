package com.dylanlxlx.iswust;

public class Page1_Item {

    private final String itemText;
    private final int itemImgId;

    public Page1_Item(String itemText, int itemImgId) {
        this.itemText = itemText;
        this.itemImgId = itemImgId;
    }

    public String getItemText() {
        return itemText;
    }

    public int getItemImgId() {
        return itemImgId;
    }
}
