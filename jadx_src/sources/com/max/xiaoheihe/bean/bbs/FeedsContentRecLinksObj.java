package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentRecLinksObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String img_height;
    private String img_width;
    private List<BBSLinkObj> items;

    public String getImg_height() {
        return this.img_height;
    }

    public String getImg_width() {
        return this.img_width;
    }

    public List<BBSLinkObj> getItems() {
        return this.items;
    }

    public void setImg_height(String str) {
        this.img_height = str;
    }

    public void setImg_width(String str) {
        this.img_width = str;
    }

    public void setItems(List<BBSLinkObj> list) {
        this.items = list;
    }
}
