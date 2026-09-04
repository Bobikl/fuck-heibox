package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchContentListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<HeyBoxContentObj> list;
    private String title;

    public List<HeyBoxContentObj> getList() {
        return this.list;
    }

    public String getTitle() {
        return this.title;
    }

    public void setList(List<HeyBoxContentObj> list) {
        this.list = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
