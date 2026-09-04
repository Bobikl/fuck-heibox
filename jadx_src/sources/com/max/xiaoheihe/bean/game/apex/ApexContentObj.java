package com.max.xiaoheihe.bean.game.apex;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApexContentObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<ApexContentBaseObj> content = new ArrayList();
    private String title;
    private String type;

    public List<ApexContentBaseObj> getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public void setContent(List<ApexContentBaseObj> list) {
        this.content = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
